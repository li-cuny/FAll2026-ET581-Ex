class ExceptionTest{
    public static void main(String[] args) {
        try{
             //int x =  10/0;  // exception happens here. and stop executing rest of the code.
              math(10, 0 );
             System.out.println("after 10/0");
        }catch(CustomArithmeticException e)  {
            System.out.println("catch block" + e);

        }finally {
            System.out.println("finally block");
        }
      
       
       System.out.println("end of code");
    }
    public static void math(int a, int b) throws CustomArithmeticException {
        if (b == 0) throw new CustomArithmeticException("b can not be 0");
        int x =  a/b;
    }
}
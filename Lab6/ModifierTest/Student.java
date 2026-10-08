public class Student{
    private String name; 
    private int age;
    //getter method
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    // setter method
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String toString(){ // this method handle System.out.println() to print whatever you define .
        String output = "name : " + this.name + " , " + this.age ;
        return output;
    }
    public boolean equals(Student other){ // define what is equals
        System.out.println("inside of equals method:::");
        if (this.name.equals(other.name)&& this.age == other.age) {
            return true;
        }else {
            return false;
        }
    }
}
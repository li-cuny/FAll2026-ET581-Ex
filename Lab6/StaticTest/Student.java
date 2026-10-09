public class Student {
    public String name; // becomes class level
    public int age;
    public static int total = 0;
    public Student(){
        total ++;
    }
}
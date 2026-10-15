public class Student {
    String name;
    int age;
    static { // static block
        System.out.println("this is static block");
    }

    { // instance- block / non-static block
        System.out.println("this is non-static block");
    }
    Student() {
        System.out.println("Student()");

    }
    Student(String name){
        this();
        this.name = name;
        System.out.println("Student(String name)");
    }
    Student(String name, int age){
        //this.name = name;
        this(name);
        this.age = age;
        System.out.println("Student(String name, int age)");
    }
    public static void main(String[] args){
        Student s = new Student("Alice", 18);
        Student s2 = new Student("Bob", 20);
    }

}
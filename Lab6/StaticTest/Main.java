public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 10;
        Student s2 = new Student();
        s2.name = "Bob";
        s2.age = 20;
        System.out.println(s1.name + s1.age);
        System.out.println(s2.name + s2.age);
        System.out.println(Student.total); // static member should call with Class name since it is class level
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        //s1.name = "Alice";
        //s1.age = 10;
        s1.setName("Alice");
        s1.setAge(10);
        System.out.println(s1.getName() + s1.getAge());
    }
}
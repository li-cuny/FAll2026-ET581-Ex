public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(); // new keyword for creating an object
        Student s2 = new Student();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        Student s3 = s1;
        System.out.println( s1 == s3);

        // print out member var
        s1.name = "Alice";
        s1.age = 10;
        s2.name = "Bob";
        s2.age = 20;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s2.name);
        System.out.println(s2.age);
        s1.display();
        s2.display();

        // call diff constructors
        Student s4 = new Student("Charlie");
        Student s5 = new Student("David", 14);
        s4.display();
        s5.display();

        // array with objects
        Student[] students = {s1, s2,s4,s5};
        System.out.println(students[0].name);
        System.out.println(students[3].name);
        for(Student element : students){
            element.display();
        }

    }
}
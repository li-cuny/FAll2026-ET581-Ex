public class Student {
    String name; // first member
    int age;     // second member 
    // constructor overloading
    Student (){ // constructor 1

    }
    Student (String name){ // constructor 2
        this.name = name;
    }
    Student (String n, int a){ // constructor 3 
        this.name = n;
        this.age = a;
    }
    void display(){ // third member
        System.out.println(this.name +"  " + age);
    }

}
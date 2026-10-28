public class Animal {
    int age;
    String name;
    void eat(){
        System.out.print("Animal eats.");
    }

    Animal(){
        System.out.println("Animal() is called.");
    }
    Animal(int age, String name){
        this.age = age;
        this.name = name;
        System.out.println("Animal(int age, String name) is called.");
    }

}
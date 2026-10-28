public class Animal {
    int age;
    String name;
    void eat(){
        System.out.print("Animal eats.");
    }
    void eat(String food){ // overloading. in one class two or more method.

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
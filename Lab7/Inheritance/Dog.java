public class Dog extends Animal {
    Dog(){
        super(1,"unknown");
        System.out.println("Dog() is called.");
    }
    void eat(){ // overriding superclass eat() method.
        System.out.print("Dog eats.");
    }
}
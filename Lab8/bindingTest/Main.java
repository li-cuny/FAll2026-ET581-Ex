public class Main{
    public static void main(String[] args) {
        // static binding - compile time binding
        Cat c = new Cat();
        Animal a = new Animal();
        System.out.println(c.age);
        System.out.println(a.age);
        // if referenc type and object type is diff
        Animal animal = new Cat();
        System.out.println(animal.age); // compile time -> no object created yet.
        
        // dynamic binding. - based on object type
        c.eat();
        a.eat();
        animal.eat();
    }
}
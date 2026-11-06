public class Dog extends Animal{
    public void sound(){
        System.out.println("Dog sound");
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        c.eat();
        d.sound();
        c.sound();
    }
}
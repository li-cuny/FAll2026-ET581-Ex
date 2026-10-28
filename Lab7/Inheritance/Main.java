public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.age = 5;
        System.out.println("================");
        Dog d = new Dog();
        d.age = 3;
        a.eat();
        d.eat();
        System.out.println("a.age = " + a.age);
        System.out.println("d.age = " + d.age);
    }
}
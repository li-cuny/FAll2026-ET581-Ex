abstract public class Animal {
    int age;
    String name;
    public Animal(){
        this.age = 1;
        this.name = "unknown";
    }
    public void eat(){
        System.out.println("Animal eat.");
    }
    public abstract void sound();
    
    // public static void main(String[] args) {
    //     Animal a = new Animal();
    //     a.eat();
    // }
}
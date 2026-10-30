import java.util.Arrays;

public class Dog extends Animal{
    Dog(int age, String name){
        super(age,name);
    }
    public static void main(String[] args){
        Animal[] animals = new Animal[3];
        for(int i=0;i<animals.length; i++){
            animals[i] = new Animal(i,"animal");
        }
        System.out.println(Arrays.toString(animals));
        animals[1] = new Dog(4,"dog"); // dog is an animal
        animals[2] = new Cat(5,"cat");
        System.out.println(Arrays.toString(animals)); 
    }
}
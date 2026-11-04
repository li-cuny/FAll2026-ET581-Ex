import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Dog();
        System.out.println(Arrays.toString(animals));
        Animal[] cats = getAllCats(animals);
        System.out.println(Arrays.toString(cats));
        //Cat cat = (Cat) animals[1]; // casting Dog type to Cat
        if(animals[0] instanceof Cat){
            Cat c = (Cat) animals[0];
        }
    }
    public static Cat[] getAllCats(Animal[] animals){
        // go through the array, find out how many cats are there,
        int count = 2;
        Cat[] cats = new Cat[count];
        int catIndex = 0;
        for(int i=0;i<animals.length;i++){
            // instanceof find out of the object type
            Animal a = animals[i];
            System.out.println(a instanceof Cat);
            if (a instanceof Cat){
                cats[catIndex] = (Cat) a;
                catIndex++;
            }
        }
        return cats;
    }
}
package edu.guilford;

/**
 * Hello world!
 *
 */
public class AnimalComparison 
{
    public static void main( String[] args )
    {
      // Make an array that stores 3 birds
      // as well as populate it with 3 random birds

      System.out.println("Birds: ");
        // Loop through the array and print out the birds
        // and their attributes
        Bird[] birds = new Bird[3];
        for (int i = 0; i < birds.length; i++) {
            birds[i] = new Bird();
            System.out.println(birds[i]);
        }
        System.out.println("\n" + "Dogs: ");
        // Make an array that stores 3 dogs
        // as well as populate it with 3 random dogs
        Dog[] dogs = new Dog[3];
        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();
            System.out.println(dogs[i]);
        }
        System.out.println("\n" + "Cats: ");
        // Make an array that stores 3 cats
        // as well as populate it with 3 random cats
        Cat[] cats = new Cat[3];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
            System.out.println(cats[i]);
        }
       // Demonstrate the abstract method
        System.out.println("\n" + "Demonstrate the abstract method: ");
        birds[0].makeSound();
        dogs[0].makeSound();
        cats[0].makeSound();
        // Demonstrate the overridden method
        System.out.println("\n" + "Demonstrate the overridden method: ");
        birds[0].eat();
        dogs[0].eat();
        cats[0].eat();
        // Demonstrate the compareTo method
        System.out.println("\n" + "Demonstrate the compareTo method: ");
        System.out.println("Compare the habitat of two birds: ");
        System.out.println(birds[0].compareTo(birds[1]));
        System.out.println("Compare the breeds of two dogs: ");
        System.out.println(dogs[0].compareTo(dogs[1]));
        System.out.println("Compare the eye colors of two cats: ");
        System.out.println(cats[0].compareTo(cats[1]));
    }
}

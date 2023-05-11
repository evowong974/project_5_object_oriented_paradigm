package edu.guilford;

import java.util.Arrays;

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
        System.out.println("\n" + "Comparing two birds: ");
        System.out.println("\n" + "\n" + "Pre-sorting: ");
        System.out.println("Bird 1: " + birds[0].getHabitat());
        System.out.println("Bird 2: " + birds[1].getHabitat());
        System.out.println("Bird 3: " + birds[2].getHabitat());

        // sort using Arrays.sort method
        Arrays.sort(birds);

        System.out.println("\n" + "Post-sorting: ");
        System.out.println("Bird 1: " + birds[0].getHabitat());
        System.out.println("Bird 2: " + birds[1].getHabitat());
        System.out.println("Bird 3: " + birds[2].getHabitat());
        


    }
}

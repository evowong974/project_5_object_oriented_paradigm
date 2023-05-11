package edu.guilford;

public class Dog extends Animal implements Comparable<Dog>{
    
    private String breed;
    private String size;
    private int weight;

    public Dog() {
        super();
        this.name = "Dog";
        species = "Canine";
        // Pick a random age lifespan of a dog that is from 0-20 years
        this.age = (int) (Math.random() * 20);
        // Choose a random breed of dog from the list of 10
        String [] dogBreeds = {"Labrador Retriever", "German Shepherd", "Golden Retriever", "French Bulldog",
        "Bulldog", "Poodle", "Beagle", "Rottweiler", "German Shorthaired Pointer", "Pembroke Welsh Corgi"};
        this.breed = dogBreeds[(int) (Math.random() * dogBreeds.length)];
        // Choose a random color from the list of 10 colors
       this.color = colors[(int) (Math.random() * 10)];
       // Choose a random size from the list of 3 sizes
        String[] dogSize = {"small", "medium", "large"};
        this.size = dogSize[(int) (Math.random() * 3)];
        // Choose a random weight from 0-150 pounds
        this.weight = (int) (Math.random() * 150);


    }
     // getters and setters
    public String getBreed() {
        return breed;
    }

    public String getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String setBreedString(String breed) {
        return this.breed = breed;
    }

    public String setSize(String size) {
        return this.size = size;
    }

    public int setWeightInt(int weight) {
        return this.weight = weight;
    }

    // Create a override method that the dog will bark
    @Override 
    public void makeSound() {
        System.out.println("bark bark, woof woof");
    }
    
    // Use the compareTo method to compare two dog's breeds
    @Override
    public int compareTo(Dog dog) {
        return this.breed.compareTo(dog.breed);
    }

    // Create the toString method to print out the dog's attributes
    @Override
    public String toString() {
        return "Dogs{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
}

package edu.guilford;

public class Cat extends Animal implements Comparable<Cat> {
    private String breed;
    private String eyecolor;
    private String furcolor;

    public Cat() {
        super();
        this.name = "Cat";
        species = "Feline";
        this.color = colors[(int) (Math.random() * 10)];
        // Pick a random age lifespan of a cat that is from 0-20 years
        this.age = (int) (Math.random() * 20);
        // Choose a random breed of cat from the list of 10
        String[] catBreeds = {"Siamese", "Persian", "Maine Coon", "Sphynx", "Bengal", 
        "Scottish Fold", "Ragdoll", "British Shorthair", "Abyssinian", "Devon Rex"};
        this.breed = catBreeds[(int) (Math.random() * catBreeds.length)]; 
        // Choose a random eye color out of 7 in the list
        String[] eyeColors = {"Green", "Blue", "Yellow", "Amber", "Brown", "Gold", "Hazel"};
        this.eyecolor = eyeColors[(int) (Math.random() * 7)];
        // Choose a random fur color out of 10 in the list
        String[] catFurColors = {"Black", "White", "Gray", "Orange", "Brown", "Cream", "Blue", "Red", "Calico", "Tabby"};
        this.furcolor = catFurColors[(int) (Math.random() * 10)];
    }

    public String breed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("meow meow, purr, purr");
    }

    // compareTo method that compares two cats on their eye color
    @Override
    public int compareTo(Cat cat) {
    return this.eyecolor.compareTo(cat.eyecolor);
    }

    @Override 
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", eyecolor='" + eyecolor + '\'' +
                ", furcolor='" + furcolor + '\'' +
                '}';
    }
}

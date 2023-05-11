package edu.guilford;

public class Bird extends Animal implements Comparable <Bird>  {

    // attributes of a bird
    private int wingspan;
    private String featherColor;
    private String habitat;

    // constructor that generates a bird object 
    // with a random value of its inherited and own attributes
    public Bird() {
        super();
        this.name = "Bird";
        // pick a random age of lifespan of a bird that's from 0-60 years
        this.age = (int) (Math.random() * 60);
        // Choose a species of bird at random from the list of 10
        String [] birdSpecies = {"Eagle", "Hawk", "Owl", "Falcon", 
        "Parrot", "Penguin", "Duck", "Goose", 
        "Swan", "Hummingbird"};
        this.species = birdSpecies[(int) (Math.random() * birdSpecies.length)];
        // Choose a random color from the list of 10 colors
        this.color = colors[(int) (Math.random() * 10)];
        // Choose a random wingspan from 0-150 inches
        this.wingspan = (int) (Math.random() * 150);
        // Choose a random feather color from the list of 10 colors
        String [] featherColors = {"red", "blue", "green", "yellow", "orange", "purple", "black", "white", "brown", "grey"};
        this.featherColor = featherColors[(int) (Math.random() * 10)];
        // Choose a random habitat from the list of 10 habitats
        String [] habitats = {"forest", "desert", "grassland", "tundra", "rainforest", "ocean", "freshwater", "mountain", "swamp", "city"};
        this.habitat = habitats[(int) (Math.random() * 10)];
    //     // conditional statements of the bird's species and its habitat
    //     if (this.species.equals("Eagle")) {
    //         this.habitat = "forest";
    //     } else if (this.species.equals("Hawk")) {
    //         this.habitat = "desert";
    //     } else if (this.species.equals("Owl")) {
    //         this.habitat = "grassland";
    //     } else if (this.species.equals("Falcon")) {
    //         this.habitat = "tundra";
    //     } else if (this.species.equals("Parrot")) {
    //         this.habitat = "rainforest";
    //     } else if (this.species.equals("Penguin")) {
    //         this.habitat = "ocean";
    //     } else if (this.species.equals("Duck")) {
    //         this.habitat = "wetlands";
    //     } else if (this.species.equals("Goose")) {
    //         this.habitat = "pond";
    //     } else if (this.species.equals("Swan")) {
    //         this.habitat = "marsh";
    //     } else if (this.species.equals("Hummingbird")) {
    //         this.habitat = "subtropical";
    //     }
 }

    // getters and setters
    public int getwingspan() {
        return wingspan;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public String getHabitat() {
        return habitat;
    }

    public int setWingspan(int wingspan) {
        return this.wingspan = wingspan;
    }

    public String setFeatherColorString(String featherColor) {
        return this.featherColor = featherColor;
    }

    public String setHabitat(String habitat) {
        return this.habitat = habitat;
    }

    // Abstract method that plays a bird communcating to other birds
    // by a certain sound it makes 
    
    @Override
    public void makeSound() {
        System.out.println("Chirp chirp, squawk squawk, tweet tweet");

    }

    public void eat() {
        System.out.println("The bird is eating.");
    }

    // Method that uses the compareTo method to compare the habitat of two birds
    @Override
    public int compareTo(Bird bird) {
        return this.habitat.compareTo(bird.habitat);
    }

    // Add the toString method that prints out the atttributes 
    // of a bird 
    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                ", color='" + color + '\'' +
                ", wingspan=" + wingspan +
                ", featherColor='" + featherColor + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }



    




    
}

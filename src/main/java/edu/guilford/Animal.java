package edu.guilford;

public abstract class Animal {

    protected String name;
    protected int age;
    protected String species;
    protected String color;

    // Array for colors of animals 
    String[] colors = {"red", "blue", "green", "yellow", "orange", "purple", "black", "white", "brown", "grey"};

    // constructor for an animal
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // empty Animal constructor with no parameters
    public Animal() {
    }
    // getters and setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public String setNameString(String name) {
        return this.name = name;
    }

    public int setAgeInt(int age) {
        return this.age = age;
    }

    public String setSpeciesString(String species) {
        return this.species = species;
    }


    // Abstract method that must be implemented by subclasses
        public abstract void makeSound();


    // Create a method that will need to be overridden by subclasses
    public void eat() {
        System.out.println("Animal is eating.");
    }
}   


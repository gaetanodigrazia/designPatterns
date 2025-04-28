package com.digrazia.creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new WildAnimalFactory();

        Dog dog = factory.createDog();
        Chimpanzee chimp = factory.createChimpanzee();

        dog.bark();
        chimp.swing();
    }
}
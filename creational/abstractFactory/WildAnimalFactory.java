package com.digrazia.creational.abstractFactory;

public class WildAnimalFactory implements AnimalFactory {
    public Dog createDog() {
        return new WildDog();
    }

    public Chimpanzee createChimpanzee() {
        return new WildChimpanzee();
    }
}
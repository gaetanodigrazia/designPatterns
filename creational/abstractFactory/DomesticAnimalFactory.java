package com.digrazia.creational.abstractFactory;

public class DomesticAnimalFactory implements AnimalFactory {
    public Dog createDog() {
        return new DomesticDog();
    }

    public Chimpanzee createChimpanzee() {
        return new DomesticChimpanzee();
    }
}
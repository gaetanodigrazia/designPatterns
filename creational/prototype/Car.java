package com.digrazia.creational.prototype;

class Car implements Prototype {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public Prototype clone() {
        return new Car(this.model, this.color); // Creazione di una copia
    }

    public void showCar() {
        System.out.println("Car Model: " + model + ", Color: " + color);
    }
}

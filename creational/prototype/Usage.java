package com.digrazia.creational.prototype;

public class Usage {
        public static void main(String[] args) {
            // Creiamo un registry con un prototipo
            CarRegistry registry = new CarRegistry();
            registry.addPrototype("Tesla", new Car("Tesla Model S", "Red"));

            // Cloniamo un nuovo oggetto dal prototipo
            Car clonedCar = (Car) registry.getPrototype("Tesla");
            clonedCar.showCar(); // Output: Car Model: Tesla Model S, Color: Red
        }
}

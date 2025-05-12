package com.digrazia.creational.prototype;

import java.util.HashMap;
import java.util.Map;

// Registry dei prototipi per gestire oggetti predefiniti
class CarRegistry {
    private Map<String, Prototype> prototypes = new HashMap<>();

    public void addPrototype(String key, Prototype prototype) {
        prototypes.put(key, prototype);
    }

    public Prototype getPrototype(String key) {
        return prototypes.get(key).clone();
    }
}
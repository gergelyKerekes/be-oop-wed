package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {

    List<Animal> animals = new ArrayList<>();

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        animals.removeIf(butcher::canButcher);
    }

    public boolean isEmpty() {
        return animals.size() == 0;
    }

    public List<String> getStatus() {
        List<String> ret = new ArrayList<>();


        for (Animal animal : animals) {
            String animalString = "";
            animalString = "There is a " + animal.getSize() +
                    " sized " + animal.getClass().getSimpleName().toLowerCase() +
                    " in the farm.";
            ret.add(animalString);
        }

        return ret;
    }
}
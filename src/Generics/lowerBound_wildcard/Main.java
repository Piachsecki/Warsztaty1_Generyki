package Generics.lowerBound_wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());

        /*
        List<? super Dog> dogs) - nie jestesmy w stanie dodac nic co jest wyzej w hierarchi niz dog -> animal nie zadziala
         */

        addFlyingDog(dogs);
        addFlyingDog(animals);

    }




    private static void addFlyingDog(List<? super Dog> dogs) {
    }


    static class Animal{


    }

    static class Dog extends Animal{

    }

    static  class FlyingDog extends Dog{

    }
}

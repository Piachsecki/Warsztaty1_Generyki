package Generics.weirdExamples;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<?> animals = new ArrayList<>();
        List<? extends Animal> animal2 = new ArrayList<>();
        List<? super Animal> animal3 = new ArrayList<>();

    }

    static class Animal{


    }

    static class Dog extends Animal {

    }

    static  class FlyingDog extends Dog {

    }
}

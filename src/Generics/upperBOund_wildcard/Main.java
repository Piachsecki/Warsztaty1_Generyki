package Generics.upperBOund_wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Monkey> monkeys = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        print(animals);
//        print(strings);
        print(monkeys);
        print(dogs);


    }

    private static void print(List<? extends Voiceable> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }



    static class Animal implements Voiceable{

    }

    interface  Voiceable {

    }

    static class Monkey extends Animal{

    }

    static class Dog  extends Animal{


    }
}

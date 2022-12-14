package Generics.Podsumowanie2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBound {
    public static void main(String[] args) {
//        List<Pigeon> pigeonList = new ArrayList<>(Arrays.asList(new Pigeon(), new Pigeon()));
        List<Animal> pigeonList = null;
        List<? super Pigeon> aList = pigeonList;
//        aList.add(new Animal());
        aList.add(new Pigeon());
        aList.add(new WalkingPigeon());
    }


    static class Animal {

    }
    static class Pigeon extends Animal {

    }


    static class WalkingPigeon extends Pigeon {

    }
}

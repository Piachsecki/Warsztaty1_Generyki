package Generics.Podsumowanie2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> stringList = Arrays.asList("super", "extra");
//        List<Dog> dogList = Arrays.asList(new Dog(), new Dog());
//        List<Pigeon> pigeonList = Arrays.asList(new Pigeon(), new Pigeon());
//        List<? extends Animal> animals1 = pigeonList;
//        List<? extends Animal> animals2 = dogList;
////        animals2.add(new Pigeon()); // ZLE !!!!
//        print(dogList);


        /*
        ten wyzej zapis nas chroni przed tym co robimy teraz,
        tutaj mozemy dodac kazdego animala , bo jakby wiemy ze tutaj
        beda same animale zeby byy w tej liscie koty psy, malpy itd
         */

        List<Pigeon> pigeonList = new ArrayList<>(Arrays.asList(new Pigeon(), new Pigeon()));
        List<? extends Animal> list2 = pigeonList;  //to jest podanie do list2 referencji do listy pigeonList
        System.out.println(list2.size());
        System.out.println(pigeonList.size());
        System.out.println("--------------------------------");

        list2.remove(0);
        System.out.println(list2.size());
        System.out.println(pigeonList.size());





        List<Animal> aList = new ArrayList<>();
        aList.add(new Pigeon());
        aList.add(new Dog());

    }

    private static void print(List<? extends Animal> stringList) {
//        stringList.add("s");
//        stringList.add(new Dog());

        System.out.println(stringList);
    }

    static class Animal{

    }

    static class Dog extends Animal{

    }
    static class Pigeon extends Animal{

    }
}

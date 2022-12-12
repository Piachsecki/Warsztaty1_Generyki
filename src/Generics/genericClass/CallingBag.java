package Generics.genericClass;

import java.util.function.Predicate;

public class CallingBag {

    public static void main(String[] args) {
//        Bag<String> bag = new Bag<>();
//        System.out.println(bag);
//
//        bag.pack("String element");
//        System.out.println(bag);
//        String empty = bag.empty();
//        System.out.println(bag);
//
//
//        Bag<Car> carBag = new Bag<>();
//        System.out.println(carBag);
//
//        carBag.pack(new Car());
//        System.out.println(carBag);
//        Car emptyCar = carBag.empty();
//        System.out.println(carBag);
//
//
//        List<Car> cars = new ArrayList<>();

        callFilteringBag();
    }



    private static void callFilteringBag() {
        Car car = new Car("red2", 2020);
        FilteringBag<Car, Predicate<Car>, Predicate<Car>> filteringBag = new FilteringBag<>(
                c -> c.getColor().equals("red"),
                c -> c.getYear().equals(2020)
        );
        filteringBag.pack(car);
    }

    static class Car{
        private String color;
        private int year;

        public String getColor() {
            return color;
        }

        public Integer getYear() {
            return year;
        }

        public Car(String color, int year) {
            this.color = color;
            this.year = year;
        }
    }



}

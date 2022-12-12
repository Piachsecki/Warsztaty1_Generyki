package Generics.genericMethods;

public class GenericMethodMain<T> {
    public static void main(String[] args) {
        call1(new Bike());
//        call1(new Integer());
    }

    public static <T extends Vehicle> void call1(T element) {
        System.out.println(element);
    }

    static class Bike extends Vehicle{

    }

    static class Vehicle{


    }
}

package Generics.Podsumowanie1;

public class Cyclist  implements BIkeable<String>{
    @Override
    public void ride(String vehicle) {
        System.out.println("Im riding a bike from company " + vehicle);
    }

    public static <T> void doSth(T element){
        System.out.println(element);
    }
}

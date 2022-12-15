package Generics.Zadania.zad5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Long> longList = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L));
        List<Double> doubleList = new ArrayList<>(Arrays.asList(1.2, 2.4, 3.4, 4.7, 5.6, 6.9));
        List<Float> floatList = new ArrayList<>(Arrays.asList(1.2f, 2.4f, 3.4f, 4.7f, 5.6f, 6.9f));
        System.out.println(findMaximum(integerList, 1, 1)    .orElse(null));
        System.out.println(findMaximum(longList, 1L, 5L)     .orElse(null));
        System.out.println(findMaximum(doubleList, 1.0, 5.2) .orElse(null));
        System.out.println(findMaximum(floatList, 1.0f, 5.2f).orElse(null));


    }



    private static <T extends Number> Optional<T> findMaximum(List<T> list, T start, T end){
        T tempMax = null;
        for (T t : list) {
            if(t.doubleValue() >= start.doubleValue() && t.doubleValue() < end.doubleValue()){
                if(Objects.isNull(tempMax) || t.doubleValue() > tempMax.doubleValue()){
                    tempMax = t;
                }
            }
        }

        return Optional.ofNullable(tempMax);
    }
}

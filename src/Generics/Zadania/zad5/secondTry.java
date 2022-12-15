package Generics.Zadania.zad5;

import java.util.List;
import java.util.Optional;

public class secondTry {
    public static void main(String[] args) {

    }



    private static <T extends Number> Optional<T> findMaximum(List<T> list, T max, T min){
        T tempMax = null;
        for (T element : list) {
            if(element.doubleValue() >= min.doubleValue() && element.doubleValue() < max.doubleValue()){
               if(tempMax == null || element.doubleValue() > tempMax.doubleValue()){
                   tempMax = element;
               }
            }
        }

        return Optional.ofNullable(tempMax);
    }
}

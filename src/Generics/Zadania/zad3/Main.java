package Generics.Zadania.zad3;

import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(2, 5, 6, 1, 3, 7, 8, 3));

        int i = collectionCounter(set, integer -> integer % 2 != 0);
        System.out.println(i);

    }

    private static <T> int collectionCounter(Collection<T> list, Predicate<T> predicate) {
        int counter = 0;
        for (T element : list) {
            if(predicate.test(element)){
                counter++;
            }
        }


        return counter;
    }
}

package Generics.Zadania.zad3;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class SecondTry {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2 ,3, 4, 5, 6, 7, 8, 9, 10));

        int result = countHowMany(set, integer -> integer % 2!= 0);
    }

    private static <T> int countHowMany(Collection<T> collection, Predicate<T> predicate) {
        int count = 0;
        for (T element : collection) {
            if(predicate.test(element)){
                count++;
            }
        }
        return count;
    }
}

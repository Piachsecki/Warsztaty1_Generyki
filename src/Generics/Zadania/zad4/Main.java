package Generics.Zadania.zad4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            Integer[] array1 = {1, 2, 3, 4, 5, 6};
            String[] array2 = {"1", "2", "3", "4", "5", "6"};
            changePosition(array2, 0, 1);
            changePosition(array1, 0, 1);

            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));

        }catch (RuntimeException e){
            e.printStackTrace();
        }


    }

    private static <T> void changePosition(T[] array ,int firstPosition, int secondPosition  ){
        if(firstPosition > array.length || secondPosition > array.length ||
                firstPosition < 0 || secondPosition < 0){
            throw new RuntimeException("Given index is not correct!");
        }

        for (int i = 0; i < array.length; i++) {
            if(i == firstPosition){
                T temp = array[i];
                array[i] = array[secondPosition];
                array[secondPosition] = temp;
            }

        }
    }
}

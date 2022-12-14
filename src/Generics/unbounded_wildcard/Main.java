package Generics.unbounded_wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> strings = new ArrayList<>();
//        strings.add("Java java learning");
//
//        List<Tuna> tunas = new ArrayList<>();
//        tunas.add(new Tuna());
//
//        print(strings);
//        print(tunas);


        Tuna<String> tuna = new Tuna<>();
        tuna.eat("Trash");

        Tuna<?> newTuna = tuna;



    }

    private static void print(List<?> list) {
        for (Object o : list) {
            System.out.println(o);

        }
    }


    static class Tuna<T>{
        private  T element;

        void eat(T element){
            this.element = element;
        }

    }
}

package Generics.Zadania.zad6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

    }


    public static class Stack<T extends ItemOnTable>{
        private List<T> myList = new ArrayList<>();

        public void put(T element){
            if(element == null){
                return;
            }
            myList.add(element);
        }

        public Optional<T> take(){
            if(myList.size() == 0){
                return Optional.empty();
            }

            return Optional.of(myList.remove(myList.size() - 1));
        }

    }

    public static class Book implements ItemOnTable{

    }

    public static class Smartphone implements ItemOnTable{

    }
    public static class Newspaper implements ItemOnTable{

    }

    public static class Sth implements ItemOnTable{

    }
    interface  ItemOnTable{

    }
}



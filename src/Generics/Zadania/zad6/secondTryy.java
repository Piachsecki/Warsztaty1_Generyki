package Generics.Zadania.zad6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class secondTryy<T extends SittingOnTable>{

    List<T> stack = new ArrayList<>();


    void put(T element){
        if(Objects.isNull(element)){
            stack.add(element);
        }
    }

    Optional<T> take(){
        if(stack.size() == 0){
            return Optional.empty();
        }
        return Optional.of(stack.remove(stack.size() - 1));
    }

    public static void main(String[] args) {

    }




}
 interface SittingOnTable{
}

class Phone implements  SittingOnTable{

}


class Book implements  SittingOnTable{

}


class Newspaper implements  SittingOnTable{

}

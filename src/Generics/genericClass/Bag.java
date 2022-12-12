package Generics.genericClass;

public class Bag <T>{
    private T element;

    @Override
    public String toString() {
        return "Bag{" +
                "element=" + element +
                '}';
    }

    public void pack(T element){
        this.element = element;
    }

    public T empty(){
        T element = this.element;
        this.element = null;
        return element;
    }

    public T getElement(){
        return element;
    }
}

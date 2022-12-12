package Generics.genericClass;

import java.util.function.Predicate;

public class FilteringBag<T, U extends Predicate<T>, V extends  Predicate<T>> {

    private T element;

    private final U filter1;

    public void pack(T element) {
        if(this.filter1.test(element) && this.filter2.test(element)){
            this.element = element;
        }else{
            throw new RuntimeException("No way!");
        }
    }

    public FilteringBag(U filter1, V filter2) {
        this.filter1 = filter1;
        this.filter2 = filter2;
    }

    public T empty() {
        T element = this.element;
        this.element = null;
        return element;
    }

    private final V filter2;
}

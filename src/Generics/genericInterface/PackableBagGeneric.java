package Generics.genericInterface;

public class PackableBagGeneric <T> implements  Packable<T>{
    @Override
    public void pack(T element) {

    }

    @Override
    public T empty() {
        return null;
    }
}

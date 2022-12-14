package Generics.Podsumowanie1;

public class Sock <T> {


    /*

    zeby java byla kontapybilna wstecznie to w momencie kompilacji
    wszystko zmienia z sie z typu T na typ Object
     */
    private T element;

    public T getElement() {
        return element;
    }

    @Override
    public String toString() {
        return "Sock{" +
                "element=" + element +
                '}';
    }

    public Sock() {
    }

    public boolean put(T element){
        if(this.element == null || !this.element.equals(element)){
            this.element = element;
//            element.swim();
            return true;
        }
        return false;
    }


    public Sock(T element) {
        this.element = element;
    }
}

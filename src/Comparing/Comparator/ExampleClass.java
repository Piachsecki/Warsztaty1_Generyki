package Comparing.Comparator;

import java.util.*;

import static java.util.Comparator.comparing;

public class ExampleClass {


    public static void main(String[] args) {
//        List<String> strings = Arrays.asList("a", "A", "B", "b", "c", "1", "2", "a");
//        System.out.println(strings);
//        Comparator<String> comparator = Comparator.<String>naturalOrder().reversed();
//        strings.sort(comparator);
//        System.out.println(strings);


        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(3, "wlodek"));
        cats.add(new Cat(2, "kacper"));
        cats.add(new Cat(1, "Zbyszek"));
        cats.add(new Cat(4, "kacper"));
        cats.add(new Cat(6, "WLadek"));
        cats.add(new Cat(5, "ana"));



        System.out.println(cats);
        Comparator<Cat> comparator1 = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                if(o1 == null){
                    return 1;
                }
                if(o2 == null){
                    return -1;
                }
                int result = o1.getName().compareTo(o2.getName());
                if(result != 0){
                    return result;
                }
                return o1.getId() - o2.getId();
            }
        };

        //mozliwe 2 sposoby:

//        Comparator<Cat> catComparator = (o1, o2) -> {
//            return o1.getName().compareTo(o2.getName());
//        };
//
//        catComparator = catComparator.thenComparing(((o1, o2) -> o1.getId() - o2.getId()));
//
//


        //najlepszy chyba sposob:
        Comparator<Cat> catComparator ;
        catComparator = Comparator.<Cat, String>comparing(cat1 -> cat1.getName())
                        .thenComparing(cat -> cat.getId());

        Collections.sort(cats, comparator1);
        System.out.println(cats);

    }
}

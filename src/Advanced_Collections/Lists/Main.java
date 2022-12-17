package Advanced_Collections.Lists;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new LinkedList<>();
        List<Integer> list5 = new ArrayList<>(list1);
        List<Integer> list6 = new ArrayList<>(List.of(1, 2, 3, 5, 6, 7));
        List<Integer> list7 = Collections.emptyList();
        List<Integer> list8 = Collections.singletonList(1);


    }
}

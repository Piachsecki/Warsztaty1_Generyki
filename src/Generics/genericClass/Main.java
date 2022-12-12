package Generics.genericClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    List list = new ArrayList<>();
    list.add(2);
    list.add("element");
    list.add(new Main());

        List<Map<String, Map<String, String>>> newList = new ArrayList<>();

        List<String> newList1 = new ArrayList<>();
        print(newList1);


    }

    private static void print(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(0);
            System.out.println(element);
        }
    }
}
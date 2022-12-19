package Advanced_Collections.Sets;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        LocalDateTime localDateTime = LocalDateTime.now();
//        LocalTime localTime = LocalTime.now();
//
//        List<Integer> integerList = Arrays.asList(1, 2, 4, 7, 4 ,86, 35, 16, 57, 843, 235, 457, 123 ,12 ,53, 5,6, 4,3, 3, 346, 46, 21,97635);
//        Set<Integer> hashset = new HashSet<>();
//        Set<Integer> treeSet = new TreeSet<>(integerList);
//
//        for (int i = 0; i < 100000; i++) {
//            hashset.add(1 + i*12);
//        }
////
////        System.out.println("hashset = " + hashset);
//        System.out.println("treeSet = " + treeSet);
//
//        NavigableSet<Integer> navigableSet = new TreeSet<>(integerList);
//        System.out.println(navigableSet.lower(50));
//        System.out.println(navigableSet.ceiling(20));
//        System.out.println(navigableSet.higher(51));
//        System.out.println(navigableSet.floor(41));

        Set<Dog> dogs = new TreeSet<>(new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o2.name.compareTo(o1.name);
            }
        });

        dogs.add(new Dog("Cyntek"));
        dogs.add(new Dog("Bartek"));
        dogs.add(new Dog("Antek"));

        System.out.println(dogs);


    }


    public static class Dog{
        private String name;

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Dog dog = (Dog) o;

            return Objects.equals(name, dog.name);
        }

        @Override
        public int hashCode() {
//            return Objects.hash(name);
            return 1;
        }

        public Dog(String name) {
            this.name = name;
        }
    }
}

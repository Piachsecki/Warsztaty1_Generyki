package Comparing.Podsumowanie2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<String> comparator = Comparator.<String>naturalOrder().reversed();
        List<Book> books = new ArrayList<>(Arrays.asList(new Book("Cetaaa", 5), new Book("Cetaaa", 2)));
        System.out.println(books);
        Collections.sort(books);
        //Comparator  - interfs funkcyjny z 1 metoda -> implementacja za pomoca lambdy
//        books.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(books);

    }

    public static class Book implements Comparable<Book>{
        private String name;
        private int numberOfPages;

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", numberOfPages=" + numberOfPages +
                    '}';
        }

        public int getNumberOfPages() {
            return numberOfPages;
        }

        public Book(String name, int numberOfPages) {
            this.name = name;
            this.numberOfPages = numberOfPages;
        }

        public String getName() {
            return name;
        }



        @Override
        public int compareTo(Book o) {
            int result = this.name.compareTo(o.name);
            if(result != 0){
                return result;

            }
            return this.numberOfPages - o.numberOfPages;

        }
    }
}

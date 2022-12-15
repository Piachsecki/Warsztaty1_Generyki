package Comparing.Comparable;

public class Dog implements Comparable{
    private String name;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Dog(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    private Integer id;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

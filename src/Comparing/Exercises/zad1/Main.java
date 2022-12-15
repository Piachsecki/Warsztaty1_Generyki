package Comparing.Exercises.zad1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Kacper", "Piasecki", 20, new BigDecimal(2000)));
        employees.add(new Employee("Michal", "Zaton", 22, new BigDecimal(3000)));
        employees.add(new Employee("Franek", "Kuzmicki", 10, new BigDecimal(3000)));
        employees.add(new Employee("Kacper", "Kowalski", 70, new BigDecimal(4000)));
        employees.add(new Employee("Franek", "Abrendt", 50, new BigDecimal(2000)));
        employees.add(new Employee("Wiktor", "Iwanow", 22, new BigDecimal(5000)));
        employees.add(new Employee("Michal", "Tlusty", 26, new BigDecimal(6000)));
        employees.add(new Employee("Bartek", "Pawlak", 27, new BigDecimal(7000)));
        employees.add(new Employee("Anna", "Lewandowski", 20, new BigDecimal(8000)));
        employees.add(new Employee("Anna", "Lewandowski", 30, new BigDecimal(80008)));
        employees.add(new Employee("Anna", "Lewandowski", 30, new BigDecimal(100000)));


        Comparator<Employee> comparator1 = (o1, o2) -> o2.getFirstName().compareTo(o1.getFirstName());
        Comparator<Employee> comparator2 =comparator1.thenComparing(((o1, o2) -> o2.getLastName().compareTo(o1.getLastName())));
        Comparator<Employee> comparator3 = comparator2.thenComparing((o1, o2) -> o1.getAge() - o2.getAge());
        Comparator<Employee> finalComperator = comparator3.thenComparing((o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));








        System.out.println("list before sorting(Comperable): ");
        System.out.println(employees);
        System.out.println("---------------------------------------------------------------");
        System.out.println("list after sorting:(Comperable) ");
        Collections.sort(employees);
        System.out.println(employees);
        System.out.println("---------------------------------------------------------------");

        System.out.println("list before sorting(Comperator): ");
        System.out.println(employees);
        System.out.println("---------------------------------------------------------------");
        System.out.println("list after sorting:(Comperator) ");
        Collections.sort(employees, finalComperator);
        System.out.println(employees);
        System.out.println("---------------------------------------------------------------");

    }
}

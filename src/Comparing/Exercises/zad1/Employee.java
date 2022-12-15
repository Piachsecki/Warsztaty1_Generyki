package Comparing.Exercises.zad1;

import java.math.BigDecimal;

public class Employee implements Comparable<Employee>{
    private String firstName;
    private String lastName;

    private int age;

    private BigDecimal salary;

    public Employee(String firstName, String lastName, int age, BigDecimal salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int resultByName = this.firstName.compareTo(o.firstName);
        if(resultByName !=0 ){
            return resultByName;
        }
        int resultBySurname = o.lastName.compareTo(this.lastName);
        if(resultBySurname !=0 ){
            return resultBySurname;
        }
        int resultByAge = this.age - o.age;
        if(resultByAge !=0 ){
            return resultByAge;
        }


        int resultBySalary = o.salary.compareTo(this.salary);
        return resultBySalary;





    }
}

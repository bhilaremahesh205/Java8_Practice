package java8.Emp;

import java8.sort.Java8Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(45);
        list.add(11);
        list.add(3);

        List<Employee> employees = DataBase.getEmployees();

        //Collections.sort(employees, new Java8Sort.MyComparator());
        Collections.sort(employees, (o1, o2) ->(int) (o1.getSalary() - o2.getSalary()));

       // System.out.println(employees);
       // employees.stream().sorted((Comparator.comparing(emp->emp.getSalary()))).forEach(System.out::println);
        employees.stream().sorted((Comparator.comparing(Employee::getDept))).forEach(System.out::println);





    }
}

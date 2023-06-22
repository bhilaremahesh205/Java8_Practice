package java8.sort;

import java8.Emp.DataBase;
import java8.Emp.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Sort {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(45);
        list.add(11);
        list.add(3);

        List<Employee> employees = DataBase.getEmployees();

        Collections.sort(employees, new MyComparator());
        System.out.println(employees);

      /* Traditional Approach

      System.out.println("*************"+list);
       //Traditional Approach
        // Collections.sort(list);
//        System.out.println(list);
        //list.stream().sorted().forEach(s-> System.out.println(s));  //ascending order
        list.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.println(s)); //decending order*/
    }

     static class MyComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o1.getSalary()-o2.getSalary());
        }
    }
}

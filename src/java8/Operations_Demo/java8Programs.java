package java8.Operations_Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class java8Programs {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"Mahesh",101,"active",50000));
        empList.add(new Employee(2,"Manish",101,"active",5000));
        empList.add(new Employee(3,"Mahendra",102,"inactive",6000));
        empList.add(new Employee(4,"Mayur",102,"inactive",7000));
        empList.add(new Employee(5,"Mangesh",103,"active",8000));
        empList.add(new Employee(6,"Madhav",104,"inactive",9000));
        empList.add(new Employee(7,"Mayank",104,"active",4000));

        Map<Integer, List<Employee>> empListBasedOnDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.toList()));
        empListBasedOnDept.entrySet().forEach(integerListEntry -> {
            System.out.println(integerListEntry.getKey()+ "------" + integerListEntry.getValue());
        });

        Map<Integer, Long> empCount = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));

    }
}

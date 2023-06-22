package java8.Emp;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
    public static List<Employee> evaluateTaxUsers(String input) {
      /*  if (input.equalsIgnoreCase("tax")) {
            return DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 30000).collect(Collectors.toList());
        } else {
            return DataBase.getEmployees().stream().filter(emp -> emp.getSalary() <= 60000).collect(Collectors.toList());
        }*/

        return  (input.equalsIgnoreCase("tax")) ?
             DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 30000).collect(Collectors.toList()):
             DataBase.getEmployees().stream().filter(emp -> emp.getSalary() <= 60000).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers("non tax"));
    }
}

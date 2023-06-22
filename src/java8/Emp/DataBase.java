package java8.Emp;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"mahesh","IT",55500));
        list.add(new Employee(2,"srujan","mech",45554));
        list.add(new Employee(3,"sunny","mech",25000));
        list.add(new Employee(4,"shushant","mech",36333));
        list.add(new Employee(5,"rohit","IT",26500));
        return list;
    }
}

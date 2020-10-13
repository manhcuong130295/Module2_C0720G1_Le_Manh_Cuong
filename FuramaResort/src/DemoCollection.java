import models.Customer;
import models.Employee;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class DemoCollection {
    public static void main(String[] args) {
        Set<Integer> employees= new TreeSet<>();
        employees.add(4);
        employees.add(1);
        employees.add(2);
        employees.add(2);
        System.out.println(employees);

    }
}

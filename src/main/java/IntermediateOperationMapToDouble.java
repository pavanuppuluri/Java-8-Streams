import java.util.Arrays;
import java.util.List;
public class IntermediateOperationMapToDouble {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Pavan", 33, 3000, "Admin", 14);
        Employee e2 = new Employee(2, "Sruthi",27, 2000, "Sales", 6);
        Employee e3 = new Employee(3, "Lasya", 21, 1000, "IT", 3);

        // Using mapToInt calculate total salaries of employees

        List<Employee> list = Arrays.asList(e1, e2, e3);

        double totalSalary = list.stream()
                .mapToDouble(e -> e.getSalary()) // Extracting employee salary as double
                .sum();                       // Calculating total salary

        System.out.println("Total salary: "+ totalSalary);   // Output 6000
    }
}




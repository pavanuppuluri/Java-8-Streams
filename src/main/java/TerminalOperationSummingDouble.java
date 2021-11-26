import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperationSummingDouble {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1000, "Pavan",  34, 3008, "Admin", 14);
        Employee employee2 = new Employee(1001, "Sruthi", 27, 2000, "Sales", 6);
        Employee employee3 = new Employee(1002, "Lasya",  21, 1000, "IT", 3);

        List<Employee> employeeList = Arrays.asList(
                employee1,
                employee2,
                employee3);

        double totalSalary = employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println(totalSalary);
    }
}

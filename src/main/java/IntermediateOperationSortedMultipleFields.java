import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntermediateOperationSortedMultipleFields {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1000, "Pavan",  34, 3000, "Admin", 14);

        Employee employee2 = new Employee(1001, "Sruthi", 21, 600, "Sales", 6);

        Employee employee3 = new Employee(1002, "Lasya",  21, 1000, "IT", 3);

        List<Employee> employeeList= Arrays.asList(
                employee1,
                employee2,
                employee3
        );

        // Sorting based on multiple fields
        // First sort Employees based on their age and then
        // based on their salary - print their names
        employeeList
                .stream()
                //Below we are passing comparator which compares Employee
                //total years of experience in descending order
                .sorted(
                        Comparator.comparing(Employee::getAge)
                                .thenComparing(Employee::getSalary))
                .map(s->s.getName())
                .forEach(System.out::println);

        // Output Lasya Sruthi Pavan
    }
}

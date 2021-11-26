import java.util.Arrays;
import java.util.List;

public class TerminalOperationAnyMatch {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1000, "Pavan",  34, 3000, "Admin", 14);
        Employee employee2 = new Employee(1001, "Sruthi", 27, 2000, "Sales", 6);
        Employee employee3 = new Employee(1002, "Lasya",  21, 1000, "IT", 3);

        List<Employee> employeeList = Arrays.asList(
                employee1,
                employee2,
                employee3);

        // Check if any employees has salary <1000
        // anyMatch() returns true if any of the stream
        // element satisfies the given condition

        boolean allEmpSalGteThousand = employeeList
                .stream()
                .allMatch(e->e.getSalary()>=1000);
        System.out.println(allEmpSalGteThousand);

        // Output true

        // Check if any employee has salary >=2000 or not
        // anyMatch() returns true if any of the stream
        // element satisfies the given condition

//        boolean anyEmpSalGte2Thousand = employeeList
//                .stream()
//                .anyMatch(e->e.getSalary()>=2000);
//        System.out.println(allEmpSalGte2Thousand);

        // Output true
    }
}

import java.util.Arrays;
import java.util.List;

public class TerminalOperationNoneMatch {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1000, "Pavan",  34, 3000, "Admin", 14);
        Employee employee2 = new Employee(1001, "Sruthi", 27, 2000, "Sales", 6);
        Employee employee3 = new Employee(1002, "Lasya",  21, 1000, "IT", 3);

        List<Employee> employeeList = Arrays.asList(
                employee1,
                employee2,
                employee3);

        // Check if no employee has salary <1000
        // noneMatch() returns true if none of the stream
        // element satisfies the given condition

        boolean noEmpSalLtThousand = employeeList
                .stream()
                .noneMatch(e->e.getSalary()<1000);
        System.out.println(noEmpSalLtThousand);

        // Output true

        // Check if any employee has salary >=2000 or not
        // anyMatch() returns true if any of the stream
        // element satisfies the given condition

//        boolean noEmpSalGt2Thousand = employeeList
//                .stream()
//                .noneMatch(e->e.getSalary()>=2000);
//        System.out.println(noEmpSalGt2Thousand);

        // Output false
    }
}

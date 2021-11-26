import java.util.Arrays;
import java.util.List;

public class TerminalOperationAllMatch {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1000, "Pavan",  34, 3000, "Admin", 14);
        Employee employee2 = new Employee(1001, "Sruthi", 27, 2000, "Sales", 6);
        Employee employee3 = new Employee(1002, "Lasya",  21, 1000, "IT", 3);

        List<Employee> employeeList = Arrays.asList(
                employee1,
                employee2,
                employee3);

        // Check if all employees have salary >=1000 or not
        // allMatch() returns true if all the stream
        // elements satisfies the given condition

        boolean allEmpSalGteThousand = employeeList
                                        .stream()
                                         .allMatch(e->e.getSalary()>=1000);
        System.out.println(allEmpSalGteThousand);

        // Output true

        // Check if all employees have salary >=2000 or not
        // allMatch() returns true if all the stream
        // elements satisfies the given condition

//        boolean allEmpSalGte2Thousand = employeeList
//                .stream()
//                .allMatch(e->e.getSalary()>=2000);
//        System.out.println(allEmpSalGte2Thousand);

        // Output flase
    }
}

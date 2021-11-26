import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class IntermediateOperationMapToInt {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Pavan", 33, 3000, "Admin", 14);
        Employee e2 = new Employee(2, "Sruthi",27, 2000, "Sales", 6);
        Employee e3 = new Employee(3, "Lasya", 21, 1000, "IT", 3);

        // Using mapToInt to find maximum age of an Employee

        List<Employee> list = Arrays.asList(e1, e2, e3);

        OptionalInt maxAge = list.stream()
                .mapToInt(e -> e.getAge())    // Extracting employee age as int
                .max();                       // Finding maximum age

        System.out.println("Maximum age: "+ maxAge);   // Output 33
    }
}






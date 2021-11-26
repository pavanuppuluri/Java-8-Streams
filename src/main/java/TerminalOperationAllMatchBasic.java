import java.util.Arrays;
import java.util.List;

public class TerminalOperationAllMatchBasic {
    public static void main(String[] args) {
        List<Integer> integerList=Arrays.asList(100,90,99,80);
        boolean allGt60 = integerList.stream().allMatch(i->i>60);
        System.out.println(allGt60);

    }
}

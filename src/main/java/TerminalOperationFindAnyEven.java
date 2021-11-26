import java.util.Random;

public class TerminalOperationFindAnyEven {
    public static void main(String[] args) {

        //Find first even number from random stream of integers

        Random random = new Random();
        System.out.println(
                            random.ints()
                                  .filter(i->i%2==0) //Check if number is even
                                  .findAny()); // Get any even number

        // Output 459228754
    }
}

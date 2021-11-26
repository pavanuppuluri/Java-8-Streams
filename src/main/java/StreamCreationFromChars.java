public class StreamCreationFromChars {
    public static void main(String[] args) {


        String s1="ABC";
        s1.chars().forEach(System.out::println);


        String s="Welcome 1to java streams27";
        s.chars()   // Returns IntStream
                .filter(n->!Character.isDigit((char)n))
                .forEach(n->System.out.print((char)n));



    }
}

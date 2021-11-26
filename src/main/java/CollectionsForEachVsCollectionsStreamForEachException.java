import java.util.ArrayList;

public class CollectionsForEachVsCollectionsStreamForEachException {
    public static void main(String[] args) {
        ArrayList<String> productList = new ArrayList<>();
        productList.add("Laptop");
        productList.add("Keyboard");
        productList.add("Mobile");
        productList.add("Mouse");
        productList.add("Webcam");
        productList.add("Mic");

        // Below code terminates immediately after exception

        productList.forEach(
                (product)-> {
                    System.out.println(product);

                    if (product.equals("Mobile")) {
                        // Modifying collection
                        productList.add("Back Cover");
                    }
                });

        // Output

        // Below code continues and throws exception after consuming
        // all elements of the stream
        productList.stream().forEach(
                (product)-> {
                    System.out.println(product);

                    if (product.equals("Mobile")) {
                        // Modifying collection
                        productList.add("Back Cover");
                    }
                });
        // Output
    }
}

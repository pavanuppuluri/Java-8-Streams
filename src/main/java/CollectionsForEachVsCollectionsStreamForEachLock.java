import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsForEachVsCollectionsStreamForEachLock {
    public static void main(String[] args) {
        List<String> nameList= Collections.synchronizedList(Arrays.asList("Pavan","Sruthi","Lasya"));
        nameList.forEach(System.out::println);
        nameList.stream().forEach(System.out::println);
    }

}

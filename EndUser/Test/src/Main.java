import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,2,4,2,6,7,8,9);

        Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(e-> e % 2 == 0));

        map.forEach((a,b) -> System.out.print(a+", "+b));
    }
}
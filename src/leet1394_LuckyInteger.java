import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class leet1394_LuckyInteger {
    public static void main(String[] args) {
        int[] array = { 1, 1, 4, 3, 3, 2, 2, 4, 4, 4};

        System.out.println(findLucky(array));
    }
    public static int findLucky(int[] arr) {

        Map<Integer, Long> map = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        i -> i,
                        Collectors.counting()
                ));

        int largest = -1;
        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            if (entry.getValue() - entry.getKey() == 0 && largest < entry.getKey()) {
                largest = entry.getKey();

            }
        }
        return largest;
    }
}

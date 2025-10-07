import java.util.Arrays;
import java.util.Collections;

public class leet274_H_index {
    public static void main(String[] args) {
        int [] citations = {1, 3, 1};

        System.out.println(hIndex(citations));
    }

    public static int hIndex(int[] citations) {
        Integer[] citationsSorted = Arrays.stream(citations)
                .boxed()
                .toArray(Integer[]::new);


        Arrays.sort(citationsSorted, Collections.reverseOrder());

        for (int i = citationsSorted.length -1; i >= 0; i--) {
            if (i+1 <= citationsSorted[i]){
                return i+1;
            }
        }

        return 0;
    }

}

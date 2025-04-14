import java.util.HashSet;
import java.util.Set;

public class leet357CountNumbersUniqueDigits {
    public static void main(String[] args) {

        System.out.println(countNumbersWithUniqueDigits(3));

    }

    public static int countNumbersWithUniqueDigits(int n) {
        int m = (int) Math.pow(10, n);

        int nonUniqueDigits = 0;

        for (int i = 0; i < m; i++) {
            String str = Integer.toString(i);
            Set<Character> seen = new HashSet<>();
            for (char c : str.toCharArray()) {
                if (seen.contains(c)) {
                    nonUniqueDigits++;
                    break;
                } else {
                    seen.add(c);
                }
            }
        }
        return m - nonUniqueDigits;
    }
}




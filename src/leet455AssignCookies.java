import java.util.Arrays;
import java.util.List;

public class leet455AssignCookies {
    public static void main(String[] args) {


        int[] kids = {1,2,2,1,1,4,5,2,2,2,2,2,1,1,4,5,2,2,2,2,2,1,1,4,5,2,2,2,2,2,1,1,4,5,2,2,2,2,2,1,1,4,5,2,2,2,2,2,1,1,4,5,2,2,2,2,2,1,1,4,5,2,2,2,2,2,1,1,4,5,2,2,2,2,2,1,1,4,5,2,2,2,2,2,1,1,4,5,2,2,2,2,2,1,1,4,5,2,2,2,2,2,1,1,4,5,2,2,2,2,2,1,1,4,5,2,2,2,2,2,1,1,4,5,2,2,2};
        int[] cookies = {1,2,3,1,1,2,3,2,2,3,1,1,2,3,2,2,3,1,1,2,3,2,2,3,1,1,2,3,2,2,3,1,1,2,3,2,2,3,1,1,2,3,2,2,3,1,1,2,3,2,2,3,1,1,2,3,2,2,3,1,1,2,3,2,2,3,1,1,2,3,2,2,3,1,1,2,3,2,2,3,1,1,2,3,2,2,3,1,1,2,3,2,2,3,1,1,2,3,2,2,3,1,1,2,3,2,2,3,1,1,2,3,2};

        int a = findContentChildren(kids,cookies);
        System.out.println("utdelade kakor = " + a);

    }
    public static int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int gPointer = 0;
        int sPointer = 0;

        while (gPointer < g.length && sPointer < s.length) {
            if (g[gPointer] <= s[sPointer]) {
                gPointer++;
                sPointer++;
            }else {
                sPointer++;
            }
        }

        return gPointer;
    }
}

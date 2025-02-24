import java.util.Arrays;

public class leet2558 {
    public static void main(String[] args) {
        int[] gifts = new int[]{25,64,9,4,100};
        System.out.println(pickGifts(gifts, 4));
        System.out.println("-----");
        int[] gifts2 = new int[]{1,1,1,1};
        System.out.println(pickGifts(gifts2, 4));
    }


        public static long pickGifts(int[] gifts, int k) {
            int largestPile;
            int sqrtedLargestPile = 0;
            long sum = 0;
            for (int i = 0 ; i < k ; i++ ){
                Arrays.sort(gifts);
                largestPile = gifts[gifts.length - 1];
                sqrtedLargestPile = (int) Math.sqrt(largestPile);
                gifts[gifts.length - 1] = sqrtedLargestPile;
            }
            for (int i = 0 ; i < gifts.length ; i++ ){
                sum += gifts[i];
            }
            return sum;
        }

}

public class leet27 {


    public static void main(String[] args) {

    }


    public int re(int[] nums, int val) {
        int sum = 0;
        int swaps = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                sum ++;
                nums[i - swaps] = nums[i];

            }
            else{
                swaps++;
            }

        }


        return sum;
    }

}

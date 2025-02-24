public class leet3264 {
    ;


    // [2,3,1,5,7] k = times  *multiplier

    //loop i>
    // if (nums[i] < nums[indexOfLowest]
    //indexOfLowest = i;
    // nums[indexOfLowest] *= multiplier
    int OperationsLeft = 4;

    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        int indexOfLowest = 0;
        for (int j = 0 ; j < k ; j++) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < nums[indexOfLowest]) {
                    i = indexOfLowest;
                }
                nums[indexOfLowest] *= multiplier;
            }
        }
        return nums;
    }
}

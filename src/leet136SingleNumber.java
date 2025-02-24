public class leet136SingleNumber {



    //  [1,3,2,6,1,6,2]  3
    //      [4,1,2,1,2]  4
    //        [3,2,2,1,3]    1


    public static int singleNumber(int[] nums) {
        //if nums has only one element, return index 0 of the array
        if (nums.length == 1){
            return nums[0];
        }


        for ( int i = 0 ; i < nums.length ; i++){
            for (int j = nums.length - 1; j >= 0 ; j--){
                if (nums[i] == nums[j] && i != j){
                    break;
                }
                if (j == 0){
                    return nums[i];
                }

            }

        }

        return nums[nums.length-1];
    }
}

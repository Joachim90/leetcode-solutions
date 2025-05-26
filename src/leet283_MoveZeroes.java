import java.util.Arrays;

public class leet283_MoveZeroes {
    public static void main(String[] args) {
        int[] nums = { 0,0,0,0,0,2, 2, 4, 2, 4, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2};

        moveZeroesBetter(nums);

    }


    //Good solution
    public static void moveZeroesBetter(int[] nums) {
        int l = 0;
        int r = 0;
        int temp;

        while(r < nums.length) {
            if (nums[l] == 0 && l != r && nums[r] != 0) {
                temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
            r++;
        }
        System.out.println(Arrays.toString(nums));


    }


    //Bad solution
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                move(i, nums);
            }
        }
        System.out.println(Arrays.toString(nums));
     }
    public static int[] move(int zeroIndex, int[] nums) {
        for (int i = zeroIndex; i < nums.length -1; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = 0;
        while(nums[zeroIndex] == 0 && !isDone(zeroIndex,nums)){
            move(zeroIndex, nums);

        }
        return nums;
    }
    //check if there is only zeroes left in array after i
    public static boolean isDone(int index, int[] nums) {
        for (int i = index; i < nums.length; i++) {
            if (nums[i] != 0) {
                return false;
            }
        }
        return true;
    }


}

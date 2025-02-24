public class leet35SearchInsertPosition {
    public static void main(String[] args) {


        int[] a = {2,2,3,4,5,6,7};
        int target = 5;

        int b = searchInsert(a, target);
        System.out.println(b);

    }
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}

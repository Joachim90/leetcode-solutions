public class leet11_ContainerMostWater {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }


    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        int h = 0;
        int w = 0;
        while (left < right) {
            h = Math.min(height[left], height[right]);
            w = Math.abs(left - right);
            max = Math.max(max, h * w);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }


        }


        return max;
    }
}

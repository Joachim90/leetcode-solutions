public class leet167TwoSum_II {

    // [1, 2, 2, 5, 6, 7, 10, 14, 19]
    //  Target 12


    public static int[] twoSum(int[] numbers, int target) {
        int highIndex = (numbers.length - 1);
        int lowIndex = 0;

        while (target != numbers[lowIndex] + numbers[highIndex]){
            int sumOfElements = numbers[lowIndex] + numbers[highIndex];

            if (sumOfElements < target){
                lowIndex++;
            }
            else{
                highIndex--;
            }

        }

        return new int[]{(lowIndex + 1), (highIndex + 1)};


    }
}

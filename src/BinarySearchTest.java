public class BinarySearchTest {

    //              MID
    //   0  1  2  3  4  5  6   7  8
    // [ 1, 2, 3, 3, 5, 7, 8 , 8, 11]
    public static int binarySearch(int[] numbers, int numberToFind) {
        int lowIndex = 0;
        int highIndex = numbers.length - 1;

        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;

            if (numberToFind == numbers[midIndex] ) {

                return midIndex;
            }
            if (numberToFind < numbers[midIndex]) {
                highIndex = midIndex - 1;
            }
            else{
                lowIndex = midIndex +1;
            }
        }
        return -1;

    }
}

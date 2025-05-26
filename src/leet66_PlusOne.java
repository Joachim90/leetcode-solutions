public class leet66_PlusOne {


    public static void main(String[] args) {
        int[] a = {9,9,9,9};

        int[] b = plusOne(a);
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }


    public static int[] plusOne(int[] digits) {




        for (int i = 1 ; i <= digits.length ; i++) {

            if (digits[digits.length - i] != 9) {
                digits[digits.length - i]++;
                return digits;
            } else {
                digits[digits.length - i] = 0;
            }

        }

        int newDigits[] = new int[digits.length + 1];
        newDigits[0] = 1;

        for (int j = 1 ; j < digits.length ; j++){
            newDigits[j] = 0;
        }
        return newDigits;
    }
}

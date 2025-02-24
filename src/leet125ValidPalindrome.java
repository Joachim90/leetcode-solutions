public class leet125ValidPalindrome {

    public static boolean isPalindrome(String s) {
        String onlyLetters = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(onlyLetters).reverse().toString().toLowerCase();
        return onlyLetters.equals(reversed);


    }
}

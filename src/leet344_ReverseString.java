public class leet344_ReverseString {
    public static void main(String[] args) {

        char[] aaa = {'a', 'b', 'c', 'd', 'e', 'f'};
        reverseString(aaa);

    }

    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        swap(s, left, right);
        System.out.println(s);

    }

    public static char[] swap(char[] s, int left, int right) {
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;

    }
}

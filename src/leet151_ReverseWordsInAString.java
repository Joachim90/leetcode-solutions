import java.util.ArrayList;
import java.util.List;

public class leet151_ReverseWordsInAString {
    public static void main(String[] args) {

        //Input: s = "the sky is blue";
        //Output: "blue is sky the"

        String s = "  the sky   is blue  ";
        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String s) {
        s = removeMultipleSpaces(s);
        String[] words = s.split(" ");

        String ans = "";
        for(int i = words.length-1; i >= 0; i--){
            ans = ans.concat(words[i]);
            ans = ans.concat(" ");
        }
        ans = ans.trim();

        return ans;
    }

    public static String removeMultipleSpaces(String s) {
        StringBuilder str = new StringBuilder();
        char lastChar = 'c';
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) != ' ' || s.charAt(i) == ' ' && lastChar != ' '){
                str.append(s.charAt(i));
            }
            lastChar = s.charAt(i);
        }
        return str.toString();
    }
}

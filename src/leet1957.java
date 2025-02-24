public class leet1957 {


    public static String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 2 ; i < sb.length() ; i++) {
            if (sb.charAt(i) == sb.charAt(i - 1) && sb.charAt(i) == sb.charAt(i - 2)) {
                sb.deleteCharAt(i);
                i = i - 1;
            }
        }
        return sb.toString();
    }
}

public class leet14_LongestCommonPrefix {

    public static void main(String[] args) {
        String[] a = {"race man","race","race car","racebar", "racoon"};
        System.out.println(longestCommonPrefix(a));

    }



    // Ugly bruteforce solution hehe
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder commonPrefix = new StringBuilder();
        String word = strs[0];

        try {
            for (int i = 0; i < word.length(); i++) {
                for (int j = 1; j < strs.length; j++) {
                    if (strs[j].charAt(i) != word.charAt(i)) {
                        return commonPrefix.toString();
                    }
                }
                commonPrefix.append(word.charAt(i));

            }
        }catch (IndexOutOfBoundsException e){
            return commonPrefix.toString();
        }




        return commonPrefix.toString();
    }
}

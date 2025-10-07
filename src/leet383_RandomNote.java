public class leet383_RandomNote {
    public static void main(String[] args) {

        String ransom = "abc";
        String magazine = "ab";

        System.out.println(canConstruct(ransom, magazine));


    }

    public static boolean canConstruct(String ransomNote, String magazine) {


        outerLoop:
        for(int i = 0; i < ransomNote.length(); i++) {
            if(magazine.isEmpty()){
                return false;
            }
            for (int j = 0; j < magazine.length(); j++) {

                if (ransomNote.charAt(i) == magazine.charAt(j)) {
                    magazine = removeLetter(magazine,j);
                    continue outerLoop;
                }
                if (j == magazine.length() - 1) {
                    return false;
                }

            }

        }
        return true;

    }

    public static String removeLetter(String s, int index){

        s = s.substring(0, index) + s.substring(index + 1);

        return s;

    }
}

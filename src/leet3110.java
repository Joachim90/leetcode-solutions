public class leet3110 {
    public static void main(String[] args) {
        char a = 'a';
        System.out.println((int)a);

        int s = scoreOfString("hello");
        System.out.println(s);

        //        hello
        //      chararray [h, e, l, l, o]
        //      i=1  difference = (int)chararray[i - 1] + (int)chararray [i]
        //   sum += Math.abs(differance)
    }


    public static int scoreOfString(String s) {
        int sum = 0;
        int diff;
        char[] chars = s.toCharArray();

        for (int i = 1; i < s.length(); i++) {
            diff = chars[i] - chars[i - 1];
            sum += Math.abs(diff);
        }

       return sum;
    }
}

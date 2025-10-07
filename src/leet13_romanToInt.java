public class leet13_romanToInt {
    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));


    }

    public static int romanToInt(String s) {
        int sum = 0;
        int latest = 999999;
        int current;
        int valueToAdd;

        for(int i = 0; i<=s.length()-1; i++){
            current = romanValue(s.charAt(i));
            if (latest < current){
                valueToAdd = current-(latest * 2); // example: if s= "IV", I adds value 1, then V adds 3 (5-2). IV=4
            }else{
                valueToAdd = current;
            }
            sum+=valueToAdd;


            latest = current;

        }


        return sum;
    }

    public static int romanValue(char s) {

        return switch (s) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;

        };
    }
}

public class leet343IntegerBreak {
    public static void main(String[] args) {

        System.out.println(integerBreak(6));

    }
    public static int integerBreak(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        if (n == 4) return 4;
        if (n == 5) return 6;

        int sum = 1;


        int numberOfThrees = n/3;
        int remainder = n%3;

        if (remainder == 0){
            for (int i = 1 ; i <= numberOfThrees; i++){
                sum *= 3;
            }
        } else if ( remainder == 1){
            for (int i = 1 ; i < numberOfThrees; i++){
                sum *= 3;
            }
            sum *= 4;
        }else if ( remainder == 2){
            for (int i = 1 ; i <= numberOfThrees; i++){
                sum *= 3;
            }
            sum *= 2;
        }




        return sum;
    }
}

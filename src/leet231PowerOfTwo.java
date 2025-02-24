public class leet231PowerOfTwo {


    public static boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 100 ; i++){
            if(Math.pow(2, i) == n){
                return true;
            }
        }
        return false;

    }
}

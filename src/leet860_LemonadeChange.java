public class leet860_LemonadeChange {
    public static void main(String[] args) {


    }
    public boolean lemonadeChange(int[] bills) {

        int fives = 0;
        int tens = 0;
        for (int i = 0 ; i < bills.length ; i++) {
            if (bills[i] == 5) {
                fives++;
            }else if (bills[i] == 10) {
                if (fives == 0) {
                    return false;
                }
                fives--;
                tens++;
            }
            if (bills[i] == 20) {
                if (tens > 0 && fives > 0) {
                    fives--;
                    tens--;
                } else if (tens == 0 && fives >= 3) {
                    fives -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

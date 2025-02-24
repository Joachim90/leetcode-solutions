
    fun guess(guessedNumber: Int): Int {
        return 0;
    }



     fun guessNumber(n:Int):Int {
        var max = n
        var min = 1;
        var answer = 2;
        var guessedNumber = 0;

        while(answer != 0) {

            guessedNumber = min + (max - min) / 2

            answer = guess(guessedNumber)

            if (answer == -1 ){
                max = guessedNumber -1
            } else {
                min = guessedNumber +1
            }


        }
        return guessedNumber;

    }




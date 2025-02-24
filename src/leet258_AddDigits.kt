fun main(){



}

fun addDigits(num: Int): Int {
    if (num < 10) return num

        var sum = 0
        val numString = num.toString()
        for (i in 0 until numString.length){
            sum = sum + numString[i].toString().toInt()
        }

    return addDigits(sum);
}
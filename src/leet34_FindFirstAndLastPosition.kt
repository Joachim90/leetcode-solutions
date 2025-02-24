
fun main(){

    val sortedArray = intArrayOf(
        1, 2, 3, 5, 6, 7, 8, 8, 8, 8, 9, 10, 12, 14, 15, 17, 18, 20, 22, 24,
        25, 27, 28, 30, 32, 34, 36, 38, 40, 42
    )
    val arr = intArrayOf(2, 2)

    val a = (searchRange(sortedArray,8))
    println(a[0])
    println(a[1])

    val b = (searchRange(arr,3))



}

fun searchRange(nums: IntArray, target: Int): IntArray {
    if (nums.isEmpty()) return intArrayOf(-1,-1)
    var foundIndex = 0
    var found = 0
    var highIndex = nums.size - 1
    var lowIndex = 0
    var counter = 0;

    while (lowIndex <= highIndex) {
        if (counter > 20){
            return intArrayOf(-1,-1)
        }



        foundIndex = lowIndex + (highIndex - lowIndex) / 2

        found = nums[foundIndex]

        if (found > target){
            highIndex = foundIndex -1
        }else if (found < target){
            lowIndex = foundIndex + 1
        }else break;

        counter++
    }

    lowIndex = foundIndex
    highIndex = foundIndex

    if (nums[foundIndex] != target){
        return intArrayOf(-1,-1)
    }

    while (true){

        if (foundIndex > 0){
            if (nums[foundIndex -1] == target){
                lowIndex = foundIndex - 1
                foundIndex --
            }else {
                break;
            }
        }else break;

    }

    while (true){
        if (foundIndex < nums.size - 1){
            if (nums[foundIndex +1] == target){
                highIndex = foundIndex + 1
                foundIndex ++
            }else {
                break;
            }

        }else break;

    }
    return intArrayOf(lowIndex,highIndex)

}

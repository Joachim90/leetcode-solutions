
fun main(){
    val arr = intArrayOf(3, 7, 12, 5, 8, 14, 22, 1, 9, 6, 18, 25, 30, 2, 11, 19, 4, 15, 21, 13)

    println("Array innan sortering: ${arr.joinToString(", ")}")

    quickSort(arr, 0, arr.size - 1) // Sortera arrayen

    println("Array efter sortering: ${arr.joinToString(", ")}")






}
fun sort(array: IntArray, low : Int, high : Int) : IntArray{


    /*Steg-för-steg för Quick Sort:

   ** Välj ett pivot-element:
   ** Först väljs ett "pivot"-element från arrayen. Det kan vara ett godtyckligt element (vanligtvis det första, sista eller ett slumpmässigt valt element).
    Målet med pivotet är att placera det på sin "slutgiltiga" plats i den sorterade arrayen.

    Dela arrayen i två delar:
    Alla element som är mindre än pivot placeras till vänster om pivot, och alla element som är större än pivot placeras till höger om pivot.
    Efter denna partitionering kommer pivoten att vara på sin rätta plats i den sorterade arrayen.

    Rekursion på vänster och höger del:
    Nu görs quick sort rekursivt på de två delarna (vänster och höger) av arrayen, som är uppdelade vid pivot.
    Detta fortsätter tills varje delarray är sorterad (dvs. varje delarray har endast ett element eller är tom).*/



    var pivotIndex = high

    var i = -1
    var j = -1
    do{
        i = low
        j = high

        while (i < j && i != pivotIndex) {
            i++
        }

        while (j > i && j == pivotIndex) {
            i--
        }



    }while(i < j)





    return array
}
fun swap (arr: IntArray, left: Int, right: Int) : IntArray {

    arr[left] = arr[right] xor arr[left]
    arr[right] = arr[left] xor arr[right]
    arr[left] = arr[right] xor arr[left]
    return arr
}






fun quickSort(arr: IntArray, low: Int, high: Int) {
    if (low < high) {
        // Partitionera arrayen
        val pi = partition(arr, low, high)

        // Rekursivt sortera vänster och höger del
        quickSort(arr, low, pi - 1)
        quickSort(arr, pi + 1, high)
    }
}

fun partition(arr: IntArray, low: Int, high: Int): Int {
    // Välj pivot (vi använder det sista elementet här)
    val pivot = arr[high]
    var i = low - 1

    for (j in low until high) {
        if (arr[j] <= pivot) {
            i++
            // Byt plats mellan arr[i] och arr[j]
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
        }
    }

    // Sätt pivot på sin rätta plats
    val temp = arr[i + 1]
    arr[i + 1] = arr[high]
    arr[high] = temp

    return i + 1
}


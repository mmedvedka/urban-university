fun main() {
/**TODO
1. Найти минимальный элемент в целочисленном массиве размера 3 х 3.
2. Создать матрицу размером 3 х 5. Найти элемент в этом массиве, который является средним(медиана).
3. Дана матрица размером 5 х 5. Заполнить ее единицами в таком   порядке:
    0 0 0 0 0
    0 0 0 0 0
    0 0 1 0 0
    0 1 1 1 0
    1 1 1 1 1
4. Дан набор целых чисел. Найти второе максимальное число.
*/
    //  1.
    println("1.")
    val matrix33 = arrayOf(
        intArrayOf(17, 12, 19),
        intArrayOf(40, 50, 10),
        intArrayOf(30, 60, 80)
    )

    var minItem = Int.MAX_VALUE;
    for (row in matrix33){
        val curMin = row.min()
        if (minItem > curMin)
            minItem = curMin
    }

    println("Minimum value is $minItem for matrix :")
    for (row in matrix33){
        for (item in row)
            print("$item\t")
        println()
    }

    //  2.
    println("2.")
    val matrix35 = arrayOf(
        intArrayOf(17, 12, 19, 31, 45),
        intArrayOf(40, 50, 10, 25, 35),
        intArrayOf(60, 36, 80, 70, 20)
    )
    val arraySize = matrix35.size;
    val arrayAvg = Array<Int>(arraySize){0}
    var curIdx = 0
    for (row in matrix35){
        arrayAvg[curIdx++] = row.average().toInt()
    }
    val medianValue = arrayAvg.average().toInt()
    var i = -1
    var j = 0
    for (row in matrix35){
        val ii = row.indexOf(medianValue)
        if (ii >= 0){
            i = ii
            break
        }
        j++
    }
    if (i >= 0) {
        println("Median value matrix[$j,$i] = $medianValue for array :")
    }
    else {
        println("Median value $medianValue not found for array :")
    }

    for (row in matrix35){
        for (item in row)
            print("$item\t")
        println()
    }

    //  3.
    println("3.")
    val matrix55 = arrayOf(
        intArrayOf(0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0),
        intArrayOf(0, 0, 1, 0, 0),
        intArrayOf(0, 1, 1, 1, 0),
        intArrayOf(1, 1, 1, 1, 1)
    )
    for (row in matrix55){
        for (item in row)
            print("$item\t")
        println()
    }

    //  4.
    println("4.")
    val arrayInt =  intArrayOf (11, 2, 13, 4, 15, 6, 17, 8, 14, 3, 20)
    arrayInt.sortDescending()
    println("The second maximum value = ${arrayInt[1].toInt()} for ${arrayInt.contentToString()}")

}

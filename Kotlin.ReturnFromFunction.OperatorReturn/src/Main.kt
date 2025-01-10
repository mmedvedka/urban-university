fun main() {
/**TODO
1. Написать функцию, на вход которой поступает массив из произвольного количества элементов.
   Данная функция проверяет, если в массиве локальные минимумы и возвращает число локальных минимумов.
   (локальный минимум – это когда два соседних элемента больше того, что между ними, например, 5,2,7).
2. Напишите функцию, в которой проверяется созданный Вами массив целых чисел.
   Если в нем имеются отрицательные элементы, то необходимо увеличить этот элемент на единицу и вернуть массив.
3. Дана матрица размера M×N и целое число K (1≤K≤M). Вывести элементы K-й строки данной матрицы.
*/

    println("1.")
    println("Count of local minimum = ${GetCountLocalMin(2,1,3,4,5,6,7,8)}")
    println("Count of local minimum = ${GetCountLocalMin(1,2,4,3,5,7,6,8,7,9)}")

    println("2.")
    val array = arrayOf(-1, 2, -3, 4, -5, 6, -7, 8, -9, 10)
    println("Array before checking ${array.contentToString()}")
    CheckNegativeElements(array)
    println("Array after checking ${array.contentToString()}")

    println("3.")
    val M = 5
    val N = 6
    val K = 3
    println("Matrix of size $M x $N: ")
    var matrixMN = Array(M) { IntArray(N) }
    for (i in matrixMN.indices){
        for (j in matrixMN[i].indices) {
            matrixMN[i][j] = i
            print("${matrixMN[i][j]}\t")
        }
        println()
    }
    println()

    println("Elements matrix of $K-row: ")
    for (col in matrixMN[K-1]) {
        print("$col\t")
    }
    println()
}

fun CheckNegativeElements(array: Array<Int>) {
    for (i in array.indices){
        if ( array[i] < 0 ) array[i] += 1
    }
}

fun GetCountLocalMin(vararg array: Int) : Int {
    var result = 0
    val size = array.size
    var min = Int.MAX_VALUE
    var count = 0
    for (i in array.indices){
       if ( i < size-2 && array[i] > array[i+1] && array[i+1] < array[i+2] ) count++
    }
    return count
}
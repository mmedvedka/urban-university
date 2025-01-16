fun main() {
/**TODO
1. Создать класс Registration с полями email и password.
   Для этого свойства email написать геттер, который возвращает значение этого поля в верхнем регистре.
   Для поля password написать сеттер, который контролирует, чтобы длина пароля была не менее 6 символов,
   иначе выводит сообщение, что не соответствует его длина.
2. Написать функцию поиска четных чисел двумерного массива размерностью 4 х 4.
3. Написать функцию заполнения двумерного массива 4 х 4 числами от 1 до 16 включительно.
4. Написать функцию вывода в консоль положительных элементов массива.
   Проверка на положительность числа выполняется локальной функцией внутри вышеуказанной.
*/
    println("1.")
    val register = Registration()
    register.setEmail("test@mail.com")
    register.setPassword("PaSsWoRd")
    println("You enter email: ${register.getEmail()} and password: ${register.getPassword()}")

    register.setEmail("test1@mail.com")
    register.setPassword("QwErt")   //  Error message

    println("2.")
    val M = 4
    val matrix = Array(M) { IntArray(M) {0} }
    FillMatrix(matrix)
    println("Even numbers of matrix 4 x 4: "+GetEvenNumbers(matrix).toIntArray().contentToString())

    println("3.")
    val N = 4
    val matrixNN = Array(N) { IntArray(N) {0} }
    FillMatrix(matrixNN)
    println("Filled matrix 4 x 4 from 1 to 16: ")
    for (i in matrixNN.indices){
        for (j in matrixNN[i].indices) {
            print("${matrixNN[i][j]}\t")
        }
        println()
    }
    println()

    println("4.")
    val posNumbers = arrayOf(
        arrayOf( 1, 2, 3, 4, 5 ),
        arrayOf( -1, -2, -3, -4, -5 ),
        arrayOf( 6, 7, 8, 9, 10 ),
        arrayOf( -6, -7, -8, -9, -10 )
    )
    println("Positive numbers of matrix :")
    PrintPositiveNumbers(posNumbers)
}

fun GetEvenNumbers(matrix: Array<IntArray>): MutableList<Int> {
    var evenNumbers = mutableListOf<Int>()
    var k = 0
    for (i in matrix.indices){
        for (j in matrix[i].indices) {
            if (matrix[i][j] % 2 == 0)
                evenNumbers.add(matrix[i][j])
        }
    }
    return evenNumbers
}

fun FillMatrix (matrix: Array<IntArray>){
    var k = 0
    for (i in matrix.indices){
        for (j in matrix[i].indices) {
            matrix[i][j] = ++k
        }
    }
}

fun PrintPositiveNumbers(matrix: Array<Array<Int>>){
    fun IsPositive(value: Int): Boolean {
        return value > 0
    }
    for (i in matrix.indices){
        for (j in matrix[i].indices) {
            if (IsPositive(matrix[i][j]))
                print("${matrix[i][j]}\t")
        }
    }
}

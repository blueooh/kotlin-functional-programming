fun main() {
    println( factorialFP(10) )
}

//TODO: 꼬리재귀로 구현
fun factorialFP(n: Int) = factorialFP(n, 1, 1)

tailrec fun factorialFP(n: Int, first: Long, second: Long): Long {
    return when(n) {
        1 -> second
        else -> factorialFP(n - 1, second, first * second)
    }
}
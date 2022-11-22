fun main() {
    println( powerTailRec(2.0, 2))
}

// TODO: 꼬리재귀로 구현
tailrec fun powerTailRec(x: Double, n: Int): Double =
    when(n) {
        0 -> 1.0
        1 -> x
        else -> x * powerTailRec(x, n - 1)
    }
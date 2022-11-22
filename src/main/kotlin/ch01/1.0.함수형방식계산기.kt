package ch01

fun main() {
    val fpCalculator = FpCalculator()

    println(fpCalculator.calcurate({n1, n2 -> n1 + n2}, 1, 2))
    println(fpCalculator.calcurate({n1, n2 -> n1 - n2}, 1, 2))
}

class FpCalculator {
    fun calcurate(calculator: (Int, Int) -> Int, num1: Int, num2: Int): Int =  calculator(num1, num2)
}
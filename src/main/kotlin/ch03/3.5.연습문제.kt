fun main() {
    println(replicate(5, 5))
}

fun replicate(n: Int, element: Int): List<Int> =
    when(n) {
        0 -> emptyList<Int>()
        else -> listOf(element) + replicate(n - 1, element)
    }
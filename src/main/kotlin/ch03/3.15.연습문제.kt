fun main() {
    println(tailrecReplicate(5, 3))
}

tailrec fun tailrecReplicate(n: Int, element: Int, acc: MutableList<Int> = mutableListOf()): List<Int> =
    when(n) {
        0 -> acc
        else -> {
            acc.add(element)
            tailrecReplicate(n - 1, element, acc)
        }
    }
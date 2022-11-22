package ch03

fun main() {
    println(quickSort(listOf(0,9,1,3,10,2,5)))
}

fun quickSort(list: List<Int>): List<Int> =
    when {
        list.isEmpty() -> emptyList()
        list.size < 2 -> list
        else -> {
            val pivot = list.random()
            val (list1, list2) = list.partition { it < pivot }
            quickSort(list1) + quickSort(list2)
        }
    }
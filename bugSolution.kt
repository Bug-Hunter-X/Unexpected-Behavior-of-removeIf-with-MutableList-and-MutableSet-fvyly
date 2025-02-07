fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val iterator = set.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() > 2) {
            iterator.remove()
        }
    }
    println(set) // Output: [1, 2]
}
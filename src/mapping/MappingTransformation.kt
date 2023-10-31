package mapping

fun main() {
    val numbers = setOf(4, 7, 6)
    println(numbers.map { it * 3 })
    println(numbers.mapIndexed { idx, value -> value * idx })
}
package kotlin_program

fun main(args: Array<String>) {

    var a = 1.32f
    var b = 3.25f

    println("---Before swap---")
    println("First number = $a")
    println("Second number = $b")

    val temporary = a
    a = b
    b = temporary

    println("---After swap---")
    println("First number = $a")
    println("Second number = $b")

}
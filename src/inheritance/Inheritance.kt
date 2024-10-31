package inheritance

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()

}

open class Dog {
    open fun sayHello() {
        println("woof!woof!")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif!")
    }
}
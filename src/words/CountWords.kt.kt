package words

fun main() {
    print("Enter a sentence: \n")
    val input = readln()

    val wordCount = countWords(input)
    println("number of words in a sentence $wordCount")
}

fun countWords(sentence: String): Int {
    val words = sentence.split(" ")
    return words.size
}
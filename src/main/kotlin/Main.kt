fun main() {

    println(numbers(2, 3, 4, 5))

    numElements()

    elements()

    values()

    sentence()

    name("Edna")
    name("Kate")





}
//QUSTION1
fun sentence() {
    val wordString = "Barnie bakes brown bagels and burns"
    wordString.forEach{ word->
        println(word)
    }

}

// QUESTION2

//sum
fun numbers(num1:Int, num2:Int, num3:Int, num4:Int):Int {
    var sum = (num1 + num2 + num3 + num4)
    return sum

}
//count
fun numElements(){
    val numArray = arrayOf(2, 3, 4, 5)
    var num = numArray.count()
    println(num)

}

//average
fun elements(){
    val elementsArray = arrayOf(2, 3, 4, 5)
    var elem = elementsArray.average()
    println(elem)
}

//QUESTION3
fun values(){
    val volume = 4/3 * 3.14159 * 7 * 7 * 7
    println(volume)

}

//QUESTION4
fun name(mineIsPalindrome:String) {

    if (mineIsPalindrome == "Edna") {
        println(true)
    } else {
        println(false)

    }
}

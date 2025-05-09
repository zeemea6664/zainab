//Write a Kotlin program that prints Hello, [Your Name]! to the console.
 /*   fun main() {
        val name = "Zainab Ahmad"
        println("Hello, $name!")
    }
*/

//
/*fun main() {
    print("Please enter your name: ")
    val name = readlnOrNull()

    print("Please enter your age: ")
    val ageString = readlnOrNull()
    println("Hello $name, you are $ageString years old!")

}*/

//Write a program that checks if a given number is even or odd.
fun main() {
    print("Enter a number: ")
    val number = readLine()?.toIntOrNull()

    if (number != null) {
        if (number % 2 == 0) {
            println("$number is even")
        } else {
            println("$number is odd")
        }
    } else {
        println("Please enter a valid number")
    }
}


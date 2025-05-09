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
/*fun main() {
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
}*/


//Task 4
/*fun main() {

    println("Numbers from 1 to 10:")
    for (i in 1..10) {
        print("$i ")
    }
    println()
    println("Even numbers from 1 to 20:")
    for (i in 1..20) {
        if (i % 2 == 0) {
            print("$i ")
        }
    }
}*/


//Task 5
/*fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main() {

    println("Sum of 5 and 3: ${sum(5, 3)}")

    println("Sum of 0 and 10: ${sum(0, 10)}")
    println("Sum of 15 and -8: ${sum(15, -8)}")
}*/

//Task 6
/*fun main() {
    val names = arrayOf("zainab", "yusuf", "maryam", "Diana", "Eve")

    for (name in names) {
        println("Hello, $name")
    }
}*/

//task 7
class Car(val brand: String, val model: String, val year: Int) {

    fun displayDetails() {
        println("Brand: $brand")
        println("Model: $model")
        println("Year: $year")
        println()
    }
}

//Task 7
/*fun main() {
    val car1 = Car("Toyota", "Corolla", 2020)
    val car2 = Car("Honda", "Civic", 2022)

    car1.displayDetails()
    car2.displayDetails()
}*/

//task 8
// Base class
/*open class Person(val name: String, val age: Int) {
    open fun printDetails() {
        println("Name: $name")
        println("Age: $age")
    }
}

// Subclass
class Student(name: String, age: Int, val grade: String) : Person(name, age) {
    override fun printDetails() {
        super.printDetails()
        println("Grade: $grade")
    }
}

fun main() {
    val student1 = Student("Alice", 19, "A")
    val student2 = Student("Bob", 21, "B")

    student1.printDetails()
    println()
    student2.printDetails()
}*/

//Task 9
/*fun main() {
    val studentScores = mapOf(
        "Ayo" to 85,
        "Zee" to 65,
        "maryam" to 72,
        "Diana" to 90,
        "Eve" to 68
    )

    println("Students who scored above 70:")
    for ((name, score) in studentScores) {
        if (score > 70) {
            println("$name scored $score")
        }
    }
}*/

//Task 10
fun main() {
    val multiply: (Int, Int) -> Int = { a, b -> a * b }

    val result = multiply(5, 4)

    println("Product: $result")
}






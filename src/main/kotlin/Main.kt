import java.text.SimpleDateFormat
import java.util.*

fun main() {
    fun task1() {
        println("Task 1:")
        val myArray = arrayOf(1, 2, 3, 4, 5)
        val myList = listOf("ayb", "ben", "gim", "da", "yech", "za")

        println("Array elements: ${myArray.joinToString()}")
        println("List elements: ${myList.joinToString()}")
        println()
    }

    fun task2() {
        println("Task 2:")
        var myString = "Hello, World!"

        myString += " Welcome to Kotlin"
        val substring = myString.substring(0, 5)
        val upperCaseString = myString.uppercase(Locale.getDefault())

        println(myString)
        println(substring)
        println(upperCaseString)
        println()
    }

    fun task3() {
        println("Task 3:")
        val myMap = mapOf("A" to 1, "B" to 2, "C" to 3)

        for ((key, value) in myMap) {
            println("Key: $key, Value: $value")
        }
        println()
    }

    fun task4(number: Int): String {
        return when {
            number > 0 -> "Positive"
            number < 0 -> "Negative"
            else -> "Zero"
        }
    }

    fun task5() {
        print("Enter your name: ")
        val name = readlnOrNull()
        print("Enter your age: ")
        val age = readlnOrNull()?.toInt()

        if (name != null && age != null) {
            println("Hello, $name! You are $age years old.")
        }
        println()
    }

    fun task6(a: Double, b: Double): String {
        return if (b != 0.0) {
            "Result from $a/$b: ${a / b}"
        } else {
            "Error: Division by zero."
        }
    }

    fun task7() {
        println("Task 7")
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val currentDateTime = dateFormat.format(Date())

        println("Current Date and Time: $currentDateTime")
        println()
    }

    data class Person(val name: String, val age: Int) {
        fun getLifeStage(): String {
            return when {
                age < 13 -> "Child"
                age in 13..19 -> "Teenager"
                else -> "Adult"
            }
        }
    }

    fun task8() {
        val person = Person("Yura", 22)
        println("Person: Name = ${person.name}, Age = ${person.age}")
    }

    fun task9(name: String, age: Int) {
        val person = Person(name, age)
        println("${person.name} is ${person.getLifeStage()}")
    }

    fun task10() {
        val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val evenNumbers = numbers.filter { it % 2 == 0 }
        println("Even numbers: ${evenNumbers.joinToString()}")
    }



    task1()
    task2()
    task3()

    println("Task 4")
    println("-10 is ${task4(-10)}")
    println("0 is ${task4(0)}")
    println("9 is ${task4(10)}")
    println()

    task5()

    println("Task 6:")
    println(task6(10.0, 5.0))
    println(task6(5.0, 0.0))
    println()

    task7()

    println("Task 8:")
    task8()
    println()

    println("Task 9:")
    task9("Yura", 22)
    println()

    println("Task 10:")
    task10()
}
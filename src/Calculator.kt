fun main() {
    // the while loop
    while (true) {        
        println("Simple Kotlin Calculator")

        // input the first value
        print("Enter your first number (or 'q' to quit): ")

        // val cannot be reassigned
        val aInput = readLine() ?: break
        if (aInput.lowercase() == "q") break

        val a = aInput.toDoubleOrNull()
        if (a == null) {
            println("Invalid input. Please try again.")
            continue
        }

        // input the operation you expect the calculator to perform for you
        print("Enter an operator (+, -, *, /): ")
        val operator = readLine() ?: continue

        // input the second value
        print("Enter your second number: ")
        val b = readLine()?.toDoubleOrNull()
        if (b == null) {
            println("Invalid input. Please try again.")
            continue
        }

        // the when expression
        val result = when (operator.trim()) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> if (b != 0.0) a/b else null
            else -> null
        }

        if (result == null) {
            println("Error: invalid operator or division by zero.")
        } else {
            println("Result: $result")
        }
    
    }
    println("Completed Operation.")


}
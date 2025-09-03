
fun main() {
    // the main calculation loop until user quits(q)
    while (true) {  
        displayHeader()       

        // get first value
        val firstNumber = getFirstNumber() ?: break

        // get arithmetic operator
        val operator = getOperator() ?: continue

        // input the second value
        val secondNumber = getSecondNumber() ?: continue

        // calculation operation
        performCalculation(firstNumber, operator, secondNumber)
    
    }
    println("Completed Operation.")


}

// the calculator header
fun displayHeader() {
    println("\n" + "=".repeat(45))
    println("Simple Kotlin Calculator")
    println("=".repeat(45))
}

// prompt for the first number
fun getFirstNumber(): Double? {
    print("Enter your first number (or 'q' to quit): ")

    val input = readLine() ?: return null

    // check for the quit "q" command
    if (input.trim().lowercase() == "q") {
        return null
    }

    // safe parsing to double
    val number = input.trim().toDoubleOrNull()
    if (number == null) {
        println("Error: '$input' is not a valid number. Please enter a numeric value.")
        return getFirstNumber()
    }

    return number
}

// prompt for the arithmetic operator
fun getOperator(): String? {
    print("Enter an operator (+, -, *, /): ")

    val operator = readLine()?.trim() ?: return null

    // validate the operator
    if (operator !in listOf("+", "-", "*", "/")) {
        println("Error: '$operator' is not a valid operator. Please enter one of +, -, *, /.")
        return null
    }

    return operator
}

// prompt for the second number
fun getSecondNumber(): Double? {
    print("Enter your second number: ")

    val input = readLine()?.trim() ?: return null

    val number = input.toDoubleOrNull()
    if (number == null) {
        println("Error: '$input' is not a valid number. Please enter a numeric value.")
        return null
    }

    return number 
}

// perform the calculations and display the result
fun performCalculation(a: Double, operator: String, b: Double) {
    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> {
            // division by 0 check
            if (b == 0.0) {
                println("Error: Division by zero is not allowed.")
                return
            }
            a / b
        }
        else -> {
            println("Error: Unexpected operator '$operator'.")
            return
        }
    }

    val formattedResult = if (result == result.toInt().toDouble()) {
        result.toInt().toString()
    } else {
        result.toString()
    }

    println("Result: $a $operator $b = $formattedResult")
}
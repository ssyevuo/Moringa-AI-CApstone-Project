// import necessary files
import kotlin.math.*

fun main() {
    // store memory of the previous calculations
    var memory: Double? = null

    // the main calculation loop until user quits(q)
    while (true) {  
        // display a title for the calculator
        displayHeader()       

        // get first value
        val firstNumber = getFirstNumber(memory) ?: break

        // get arithmetic operator
        val operator = getOperator() ?: continue

        // input the second value only if needed for some operations
        val secondNumber = getSecondNumber(operator)

        // calculation operation
        val result = performCalculation(firstNumber, operator, secondNumber)

        // store result into memory
        if (result != null) {
            memory = result 
        }
    
    }
    println("Completed Operation.")

}

// the calculator header
fun displayHeader() {
    println("\n" + "=".repeat(45))
    println("Simple Kotlin Calculator")
    println("Operators: +, -, *, /, ^, sqrt, %")
    println("Use 'M' to resuse the previous result, 'q' to quit")
    println("=".repeat(45))
}

// prompt for the first number
fun getFirstNumber(memory: Double?): Double? {
    print("Enter your first number (or 'q' to quit, 'M' for memory): ")

    val input = readLine() ?: return null

    // check for the quit "q" command
    if (input.trim().lowercase() == "q") return null
    if (input.trim().uppercase() == "M") {
        if (memory == null) {
            println("Error: No value stored in memory.")
            return getFirstNumber(memory)
        }
        return memory
    }

    // safe parsing to double
    val number = input.trim().toDoubleOrNull()
    if (number == null) {
        println("Error: '$input' is not a valid number. Please enter a numeric value.")
        return getFirstNumber(memory)
    }

    return number
}

// prompt for the arithmetic operator
fun getOperator(): String? {
    print("Enter an operator (+, -, *, /, ^, sqrt, %): ")

    val operator = readLine()?.trim() ?: return null

    // validate the operator
    if (operator !in listOf("+", "-", "*", "/", "^", "sqrt", "%")) {
        println("Error: '$operator' is not a valid operator. Please enter one of +, -, *, /, ^, sqrt, %.")
        return null
    }

    return operator
}

// prompt for the second number
fun getSecondNumber(operator: String): Double? {
    if (operator == "sqrt") return null //the second number is not necessary for square root

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
fun performCalculation(a: Double, operator: String, b: Double?): Double? {
    val result = when (operator) {
        "+" -> if (b != null) a + b else null
        "-" -> if (b != null) a - b else null
        "*" -> if (b != null) a * b else null
        "/" -> if (b != null && b != 0.0) a / b else {
                println("Error: Division by zero is not allowed.")
                null
        }
        "^" -> if (b != null) a.pow(b) else null
        "sqrt" -> if (a >= 0) sqrt(a) else {
            println("Error: Cannot find square root of a negative number.")
            null
        }
        "%" -> if (b != null) a * (b / 100.0) else null
       
        else -> null
    }

    if (result != null) {
        val formattedResult = if (result == result.toInt().toDouble()) {
            result.toInt().toString()
        } else {
            result.toString()
        }

        if (b != null) {
            println("Result: $a $operator $b = $formattedResult")
        } else {
            println("Result: $operator($a) = $formattedResult")
        }
    }
    
    return result    
}
# Kotlin Toolkit for Capstone Project 

## Title & Objective
This toolkit documents the process of learning Kotlin, setting up the development environment, and building a Calculator appliation (MVP + extended features). It also includes an AI prompt journal to track learning steps

## Quick Summary of Kotlin
- Kotlin is a modern programming language developed by etBrains.
- Fully interoperable with Java (runs on JVM).
- Used for Android development, backend services (Ktor, Spring), and multiplatform projects.
- Features: concise syntax, null safety, functional + OOP styles.

## Learning Outcomes
- Kotlin Syntax Fundamentals
- Safe null handling with `?.` and `toDoubleOrNull()`
- WHen expressions vs if-else
- Function documentation

## Project Structure
Moringa-AI-Capstone-Project/
|-- src/
│   └-- Calculator.kt
├-- LICENSE
├-- README.md
└-- toolkit.md

## System Requirements
- **Java Development Kit (JDK)**: version 11 or higher
- **Gradle**: build automation tool .........
- **IntelliJ IDEA** or **VS Code** with Kotlin Plugin
- **OS**: Linux / macOS / Windows

## Installations & Setup

### 1. Install JDK
```bash
sudo apt update
sudo apt install openjdk-17-jdk
java -version
```

### 2. Install Gradle
```bash
sudo snap install gradle --classic
gradle -v
```

## Calculator Project

### MVP: Basic Calculator
- Addition
- Subtraction
- Multiplication
- Division

### Extended Features
- Square root
- Power (exponent)
- Memory (store & recall)
- User menu (loop until exit)

### Sample of the Function

=============================================
Simple Kotlin Calculator
Operators: +, -, *, /, ^, sqrt, %
Use 'M' to resuse the previous result, 'q' to quit
=============================================
Enter your first number (or 'q' to quit, 'M' for memory): 10
Enter an operator (+, -, *, /, ^, sqrt, %): ^
Enter your second number: 3
Result: 10.0 ^ 3.0 = 1000

### Key Kotlin Cocepts Used
**Safe Null Handling:**
```kotlin
    val number = input.toDoubleOrNull()
    if (number == null) {
        println("Error: '$input' is not a valid number. Please enter a numeric value.")
        return null
    }
```

## AI Prompt Journal
**Prompt**: I need to improve this code's readability by adding appropriate comments and documentation: [ the snippet of the necessary code] 
Please: 
1. Add a clear function/method description comment that explains purpose, inputs, and outputs 
2. Add comments for complex or non-obvious code sections 
3. Document any assumptions, edge cases, or limitations 
4. Explain any algorithms or business rules implemented 
5. Don't add obvious comments that just repeat what the code clearly says 
6. Use the standard comment style for the language
7. Also help me rewrite the Kotlin calculator to use safe parsing with toDoubleOrNull and to show helpful errors.

**Key Learnings**:
- Kotlin Documentation Standards
- Function decomposition benefits
- Error handling practices

**Evaluation**: Was clear, gave working code with improved comments, easy to integrate

## Common Issues & Fixes
- **gradle: command not found** -> Install with *sudo snap install gradle --classic*
- **no main manifest attribute** -> Ensure you compile with *-include-runtime* or run via Gradle
- **Kotlin file not recognized** -> Install Kotlin plugin in VS Code







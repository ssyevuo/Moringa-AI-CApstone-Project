# Kotlin Calculator Project

## Project Overview
- This project is a **command-line calculator** built with **Kotlin**.
- It starts simple with simple operations (addition, subtraction, multiplication, division) and adds more advanced features (Square root, Power, Percentage, and Memory that is of the last result)

## How to Install Kotlin

### 1. Install JDK
```bash
sudo apt update
sudo apt install openjdk-17-jdk
java -version
```

### 2. Install Kotlin Compiler
```bash
sudo snap install kotlin --classic
```

- Verify installation
```bash
kotlin -version
```

### 3. Install Gradle
```bash
sudo snap install gradle --classic
gradle -v
```

## How to run the Calculator

### **Option A**: Run Directly with Kotlin Compiler
```bash
kotlinc Calculator.kt -include-runtime -d Calculator.jar
java -jar Calculator.jar
```

### **Option B**: Run with Gradle
- if initialized with `gradle init --type kotlin-application`, run:

```bash
gradle run
```
## Example Usage
 ```sql
    =============================================
    Simple Kotlin Calculator
    Operators: +, -, *, /, ^, sqrt, %
    Use 'M' to resuse the previous result, 'q' to quit
    =============================================
    Enter your first number (or 'q' to quit, 'M' for memory): 9
    Enter an operator (+, -, *, /, ^, sqrt, %): sqrt
    Result: sqrt(9.0) = 3

    =============================================
    Simple Kotlin Calculator
    Operators: +, -, *, /, ^, sqrt, %
    Use 'M' to resuse the previous result, 'q' to quit
    =============================================
    Enter your first number (or 'q' to quit, 'M' for memory): M
    Enter an operator (+, -, *, /, ^, sqrt, %): *
    Enter your second number: 4
    Result: 3.0 * 4.0 = 12
 ```
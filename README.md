# 🧮 Simple Calculator (Java Console App)

This is a basic Java console-based calculator that allows users to perform simple arithmetic operations: **Addition, Subtraction, Multiplication, and Division**.

## 📋 Features

- Accepts two numbers from the user
- Provides a menu of operations to choose from
- Performs the selected arithmetic operation
- Handles division by zero with an error message

## 🔢 Supported Operations

| Choice | Operation      |
|--------|----------------|
| 1      | Addition        |
| 2      | Subtraction     |
| 3      | Multiplication  |
| 4      | Division        |


## 🧪 Example Usage

```text
Please Enter The First Number
10
Please Enter The Second Number
5
Choose an operation
1, Addition
2, Subtraction
3, Multiplication
4, Division
3
Result: 50.0
🚀 How to Run (In Eclipse)
Open Eclipse and create a Java project

Inside the src/day3/ directory, add the file: Calculator.java

Right-click the file → Run As > Java Application

Follow the console prompts

📂 Project Structure

src/
└── day3/
    └── Calculator.java
📌 Requirements
Java 8 or higher

Eclipse IDE (or any Java-compatible IDE)

JDK properly set up in the build path

🛠️ Implementation Highlights
Uses Scanner for input

Implements a switch statement to handle operation selection

Includes basic input handling and validation (e.g., division by zero)

💡 Potential Improvements
Add support for more operations (modulus, exponent, etc.)

Include input validation for non-numeric input

Use loops to allow multiple calculations in one session

👤 Author
This project was built as a beginner-level Java exercise to learn:

Basic user input handling

Conditional logic using switch

Arithmetic operations and control structures


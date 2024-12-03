// MyKotlinCalculator by Gabriel Castro
// This is a simple calculator that performs basic arithmetic operations
// such as addition, subtraction, multiplication, and division.


fun main() {

    // Variable used to determine if the user wants to perform multiple calculations
    var multipleCalculation = true

    while (multipleCalculation) {

        var num1: Double? = null
        // The following loop ensures a valid number is entered
        while (num1 == null) {

            print("Enter the first number: ")
            val input = readlnOrNull()
            num1 = try {
                input?.toDouble()
            } catch (e: NumberFormatException) {
                println("Invalid entry. Please enter a valid number.")
                null
            }
        }

        var num2: Double? = null
        // The following loop ensures a valid number is entered
        while (num2 == null) {

            print("Enter the first number: ")
            val input = readlnOrNull()
            num2 = try {
                input?.toDouble()
            } catch (e: NumberFormatException) {
                println("Invalid entry. Please enter a valid number.")
                null
            }
        }

        // The following loop ensures a valid operation is entered
        print("Choose the operation (+, -, *, /): ")
        val operation = readlnOrNull()

        // The following loop performs the operation entered above
        val result = when (operation) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> if (num2 != 0.0) num1 / num2
            else "Division by zero"

            else -> "Invalid operation"
        }

        // Presents the result of the operation
        println("Result: $result")

        // Presents the option to perform another calculation or to exit the program
        print("Would you like to perform another calculation? Enter yes or no to proceed: ")
        multipleCalculation = readlnOrNull()?.toLowerCase() == "yes"

    }
}
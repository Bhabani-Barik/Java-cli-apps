##Java Project :: Simple Calculator
The Simple Calculator project allows users to perform basic arithmetic operations such as addition, subtraction, multiplication, and division. The user inputs two numbers and selects an operation, and the calculator processes the input to return the result. It handles basic mathematical calculations and can be extended to include additional features like error handling (e.g., division by zero) or supporting more advanced operations like exponentiation or modulus.

Here are two different solutions for the Simple Calculator project in Java.
1. Using If-Else Statements
    Input:: The program prompts the user to input two numbers and an operator.
    Operations:: The arithmetic operations are handled using if-else conditions based on the operator entered.
    Edge Case:: Division by zero is checked to prevent errors.
    Result:: The result is displayed to the user.
    Invalid Input:: If an operator other than +, -, *, or / is entered, the program notifies the user.

2. Using Switch-Case Statements ::
    Input: The user inputs two numbers and an operator.
    Switch-Case: The operations are performed using a switch-case block based on the operator entered.
    Edge Case: Division by zero is handled inside the switch block to avoid errors.
    Result: The result is displayed after performing the calculation.
    Invalid Input: The default case of the switch block handles invalid operators and informs the user.

import java.util.Scanner;

public class simpleCalculatorIfElse {   
    public static void main(String[] args) {
        //Create a Scanner Object for input
        Scanner scanner = new Scanner(System.in);

        //Input first number
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        //Input second Number
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Input the Operator(+, -, *, /)
        System.out.println("Enter an operator ( +, -, *, /): ");
        char operator = scanner.next().charAt(0);

        //variable to store the result
        double result = 0;

        //perform the operation based on the  user input using if-else
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            //Handle  division  by zero case
            if ( num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error:Can not be Division by zero.");
                return;
            }
        } else {
            // if an invalid operator is entered
            System.out.println("Invalid operator! Please enter +, -, *, / ");
            return;
        }

        //Output the result
        System.out.println("The result is: " + result);
    } 
}

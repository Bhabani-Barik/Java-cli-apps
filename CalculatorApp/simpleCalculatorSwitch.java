import java.util.Scanner;

public class simpleCalculatorSwitch {
    public static void main(String[] args) {
        // Create a Scanner Object for input
        Scanner scanner = new Scanner(System.in);

        //Input First NUmber 
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        //Input second number
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        //Input the operator (+, -, *, /)
        System.out.println("Enter an operator (+, -, *, / )");
        char operator = scanner.next().charAt(0);

        //variable to store the result
        double result = 0;

        //Perform the operation using switch-case
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Handle division  by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Can not  be Division by Zero.");
                    return;
                }
                break;
            default:
                // If an Invalid operator is entered
                System.out.println("Invalid Operator! Please enter +, -, *, / ");
                return;
        }
        
        // Output the result
        System.out.println("The result is : " +  result);
    }
}
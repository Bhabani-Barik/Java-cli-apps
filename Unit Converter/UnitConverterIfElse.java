import java.util.Scanner;

public class UnitConverterIfElse {
    public static void main(String[] args) {
        //Create a Scanner object  to capture user input
        Scanner scanner = new Scanner(System.in);

        //Input the value to be converted
        System.out.println("Enter the value: ");
        double value = scanner.nextDouble();

        //Input the type of conversion (length, temperature, weight)
        System.out.println("Enter the unit type (length, temperature, weight): ");
        String unitType = scanner.next().toLowerCase();

        // Input the unit to convert from
        System.out.print("Enter the unit to convert from (e.g., kilometers, celsius, kilograms, miles, fahrenheit, pounds): ");
        String fromUnit = scanner.next().toLowerCase();

        //Input the unit to convert to 
        System.out.println("Enter the unit to convert to (e.g: kilometers, celsius, kilograms, miles, fahrenheit, pounds): ");
        String toUnit = scanner.next().toLowerCase();

        //Variable to store the result 
        double convertedValue = 0;
        
        //Perform the conversion based on unit typeusing if-else statements
        if (unitType.equals("length")) {
            //Length Conversion (e.g., Kilometers to miles)
            if (fromUnit.equals("kilometers") && toUnit.equals("miles")) {
                convertedValue = value * 0.621371;
            } else if (fromUnit.equals("miles") && toUnit.equals("kilometers")) {
                convertedValue = value * 1.60934;
            } else {
                System.out.println("Invalid length conversion");
                return;
            }
        } else if (unitType.equals("temperature")) {
            // Temperature conversion (e.g., Celsius to Fahrenheit)
            if (fromUnit.equals("celsius") && toUnit.equals("fahrenheit")) {
                convertedValue = (value * 9/5) + 32;
            } else if (fromUnit.equals("fahrenheit") && toUnit.equals("celsius")) {
                convertedValue = (value - 32) * 5/9;
            } else {
                System.out.println("Invalid temperature conversion.");
                return;
            }
        } else if (unitType.equals("weight")) {
            // Weight conversion (e.g., kilograms to pounds)
            if (fromUnit.equals("kilograms") && toUnit.equals("pounds")) {
                convertedValue = value * 2.20462;
            } else if (fromUnit.equals("pounds") && toUnit.equals("kilograms")) {
                convertedValue = value * 0.453592;
            } else {
                System.out.println("Invalid weight conversion.");
                return;
            }
        } else {
            System.out.println("Invalid unit type.");
            return;
        }

        // Output the converted value
        System.out.println("Converted value: " + convertedValue + " " + toUnit);
    }
}
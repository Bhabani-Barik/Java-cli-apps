import java.util.Scanner;

public class UnitConverterSwitch {
    public static void main(String[] args) {
        // Create a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

      // Input the value to be converted
        System.out.print("Enter the value: ");
        double value = scanner.nextDouble();

        // Input the type of conversion (length, temperature, weight)
        System.out.print("Enter the unit type (length, temperature, weight): ");
        String unitType = scanner.next().toLowerCase();

        // Input the unit to convert from
        System.out.print("Enter the unit to convert from (e.g., kilometers, celsius, kilograms,miles, fahrenheit, pounds):");
        String fromUnit = scanner.next().toLowerCase();

        // Input the unit to convert to
        System.out.print("Enter the unit to convert to (e.g.,kilometers, celsius, kilograms, miles, fahrenheit, pounds): ");
        String toUnit = scanner.next().toLowerCase();

        // Variable to store the result
        double convertedValue = 0;

        // Switch-case for unit type
        switch (unitType) {
            case "length":
                // Switch-case for length conversion
                switch (fromUnit) {
                    case "kilometers":
                        if (toUnit.equals("miles")) {
                            convertedValue = value * 0.621371;
                        } else {
                            System.out.println("Invalid length conversion.");
                            return;
                        }
                        break;
                    case "miles":
                        if (toUnit.equals("kilometers")) {
                            convertedValue = value * 1.60934;
                        } else {
                            System.out.println("Invalid length conversion.");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Invalid unit for length.");
                        return;
                }
                break;

            case "temperature":
                // Switch-case for temperature conversion
                switch (fromUnit) {
                    case "celsius":
                        if (toUnit.equals("fahrenheit")) {
                            convertedValue = (value * 9/5) + 32;
                        } else {
                            System.out.println("Invalid temperature conversion.");
                            return;
                        }
                        break;
                    case "fahrenheit":
                        if (toUnit.equals("celsius")) {
                            convertedValue = (value - 32) * 5/9;
                        } else {
                            System.out.println("Invalid temperature conversion.");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Invalid unit for temperature.");
                        return;
                }
                break;

            case "weight":
                // Switch-case for weight conversion
                switch (fromUnit) {
                    case "kilograms":
                        if (toUnit.equals("pounds")) {
                            convertedValue = value * 2.20462;
                        } else {
                            System.out.println("Invalid weight conversion.");
                            return;
                        }
                        break;
                    case "pounds":
                        if (toUnit.equals("kilograms")) {
                            convertedValue = value * 0.453592;
                        } else {
                            System.out.println("Invalid weight conversion.");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Invalid unit for weight.");
                        return;
                }
                break;

            default:
                System.out.println("Invalid unit type.");
                return;
        }

        // Output the converted value
        System.out.println("Converted value: " + convertedValue + " " + toUnit);
    }
}  

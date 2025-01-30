import java.util.Scanner;

public class CurrencyConverterIfElse {
    public static void main(String[] args) {
        //Create a Scanner Object to capture user input
        Scanner scanner = new Scanner(System.in);

        //Input the amount to convert
        System.out.println("Enter the amount: ");
        double amount = scanner.nextDouble();

        // Input the source currency (currency convert from)
        System.out.println("Enter the currency to convert from (USD, EUR, INR): ");
        String fromCurrency = scanner.next().toUpperCase();

        //Input the target currency ( currency to convert to )
        System.out.println("Enter the currency to convert to (USD, EUR, INR): ");
        String toCurrency = scanner.next().toUpperCase();

        //variable to store the conversion rate
        double conversionRate = 0;

        //Perform currency conversion using if-else  statements 
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            conversionRate = 0.9602; //Example conversion rate from USD to EUR
        } else if (fromCurrency.equals("USD") && toCurrency.equals("INR")) {
            conversionRate = 86.5823;
        }else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            conversionRate = 1.0414; // Example conversion rate from EUR to USD
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("INR")) {
            conversionRate = 90.1698; // Example conversion rate from EUR to INR
        } else if (fromCurrency.equals("INR") && toCurrency.equals("USD")) {
            conversionRate = 0.0115; // Example conversion rate from INR to USD
        } else if (fromCurrency.equals("INR") && toCurrency.equals("EUR")) {
            conversionRate = 0.0111; // Example conversion rate from INR to EUR
        } else {
            // Handle invalid currency combinations
            System.out.println("Invalid currency combination.");
            return;
        }

        // Calculate the converted amount
        double convertedAmount = amount * conversionRate;

        // Output the converted amount
        System.out.println("Converted amount: " + convertedAmount + " " + toCurrency);
    }
}
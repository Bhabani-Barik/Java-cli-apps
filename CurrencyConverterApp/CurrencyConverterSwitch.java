import java.util.Scanner;

public class CurrencyConverterSwitch {
    public static void main(String[] args) {
        // Create a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Input the amount to convert
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        // Input the source currency
        System.out.print("Enter the currency to convert from (USD, EUR, INR): ");
        String fromCurrency = scanner.next().toUpperCase();

        // Input the target currency
        System.out.print("Enter the currency to convert to (USD, EUR, INR): ");
        String toCurrency = scanner.next().toUpperCase();

        // Variable to store the conversion rate
        double conversionRate = 0;

        // Switch-case for currency conversion based on source and target currencies
        switch (fromCurrency) {
            case "USD":
                switch (toCurrency) {
                    case "EUR":
                        conversionRate = 0.9602; // USD to EUR conversion rate
                        break;
                    case "INR":
                        conversionRate = 86.5823; // USD to INR conversion rate
                        break;
                    default:
                        System.out.println("Invalid target currency.");
                        return;
                }
                break;

            case "EUR":
                switch (toCurrency) {
                    case "USD":
                        conversionRate = 1.0414; // EUR to USD conversion rate
                        break;
                    case "INR":
                        conversionRate = 90.1698; // EUR to INR conversion rate
                        break;
                    default:
                        System.out.println("Invalid target currency.");
                        return;
                }
                break;

            case "INR":
                switch (toCurrency) {
                    case "USD":
                        conversionRate = 0.0115; // INR to USD conversion rate
                        break;
                    case "EUR":
                        conversionRate = 0.0111; // INR to EUR conversion rate
                        break;
                    default:
                        System.out.println("Invalid target currency.");
                        return;
                }
                break;

            default:
                System.out.println("Invalid source currency.");
                return;
        }

        // Calculate the converted amount
        double convertedAmount = amount * conversionRate;

        // Output the converted amount
        System.out.println("Converted amount: " + convertedAmount + " " + toCurrency);
    }
}  


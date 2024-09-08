import java.util.Scanner;

public class CurrencyConverter {
    
    // Method to convert the amount from one currency to another
    public static double convert(double amount, double rate) {
        return amount * rate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fixed exchange rates (relative to 1 USD)
        double usdToEur = 0.85;
        double usdToGbp = 0.75;
        double usdToJpy = 110.0;
        double eurToUsd = 1.18;
        double gbpToUsd = 1.33;
        double jpyToUsd = 0.0091;

        System.out.println("Welcome to the Currency Converter!");
        System.out.println("Available currencies: USD, EUR, GBP, JPY");
        
        // Get the base currency
        System.out.print("Enter the currency you want to convert from (e.g., USD): ");
        String fromCurrency = scanner.next().toUpperCase();

        // Get the target currency
        System.out.print("Enter the currency you want to convert to (e.g., EUR): ");
        String toCurrency = scanner.next().toUpperCase();

        // Get the amount to convert
        System.out.print("Enter the amount you want to convert: ");
        double amount = scanner.nextDouble();

        // Variable to store the conversion rate
        double rate = 0;

        // Determine the conversion rate based on the currencies selected
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            rate = usdToEur;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("GBP")) {
            rate = usdToGbp;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("JPY")) {
            rate = usdToJpy;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            rate = eurToUsd;
        } else if (fromCurrency.equals("GBP") && toCurrency.equals("USD")) {
            rate = gbpToUsd;
        } else if (fromCurrency.equals("JPY") && toCurrency.equals("USD")) {
            rate = jpyToUsd;
        } else {
            System.out.println("Invalid currency pair. Please try again.");
            scanner.close();
            return;
        }

        // Convert the amount and display the result
        double convertedAmount = convert(amount, rate);
        System.out.printf("%.2f %s is equal to %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);

        scanner.close();
    }
}
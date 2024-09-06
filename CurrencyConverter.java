import java.util.Scanner;


public class CurrencyConverter {
    // Conversion rate from USD to INR
    private double conversionRate;

    // Constructor
    public CurrencyConverter(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    // Getter for conversionRate
    public double getConversionRate() {
        return conversionRate;
    }

    // Setter for conversionRate
    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the conversion rate
        System.out.print("Enter the conversion rate from USD to INR: ");
        double rate = scanner.nextDouble();

        // Create a CurrencyConverter object with the provided rate
        CurrencyConverter converter = new CurrencyConverter(rate);

        // Prompt the user to enter the amount in USD
        System.out.print("Enter amount in USD: ");
        double usd = scanner.nextDouble();

        // Convert USD to INR
        double inr = usd * converter.getConversionRate();

        // Display the result
        System.out.println(usd + " USD is equal to " + inr + " INR");

        // Close the scanner
        scanner.close();
    }
}

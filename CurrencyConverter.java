import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double usdToInr = 83.12;
        double eurToInr = 90.45;
        double gbpToInr = 105.67;

        System.out.println("===== Currency Converter =====");
        System.out.println("1. USD to INR");
        System.out.println("2. EUR to INR");
        System.out.println("3. GBP to INR");

        System.out.print("Choose conversion option: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double convertedAmount = 0;

        switch(choice) {

            case 1:
                convertedAmount = amount * usdToInr;
                System.out.println("Converted Amount: ₹" + convertedAmount);
                break;

            case 2:
                convertedAmount = amount * eurToInr;
                System.out.println("Converted Amount: ₹" + convertedAmount);
                break;

            case 3:
                convertedAmount = amount * gbpToInr;
                System.out.println("Converted Amount: ₹" + convertedAmount);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class JavaFunctionToCalculateNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of currency notes
        System.out.println("Enter the number of INR 10 notes:");
        int num10 = scanner.nextInt();
        System.out.println("Enter the number of INR 50 notes:");
        int num50 = scanner.nextInt();
        System.out.println("Enter the number of INR 100 notes:");
        int num100 = scanner.nextInt();
        System.out.println("Enter the number of INR 200 notes:");
        int num200 = scanner.nextInt();

        // Input the price of the item
        System.out.println("Enter the price of the item:");
        int price = scanner.nextInt();

        // Array of notes
        int[] notes = {num10, num50, num100, num200};

        // Check if the item can be purchased
        String result = canPurchase(notes, price);
        System.out.println(result);

        scanner.close();
    }

    public static String canPurchase(int[] notes, int price) {
        // Currency values in INR
        int[] values = {10, 50, 100, 200};

        // Calculate the total money available
        int totalMoney = 0;
        for (int i = 0; i < notes.length; i++) {
            totalMoney += notes[i] * values[i];
        }

        // Check if the total money is enough to buy the item
        if (totalMoney >= price) {
            return "I can purchase";
        } else {
            return "I need more money";
        }
    }
}


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindingDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the series of numbers
        System.out.println("Enter the number of elements in the series:");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the numbers in the series:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find and print duplicate numbers
        findDuplicates(numbers);

        scanner.close();
    }

    public static void findDuplicates(int[] numbers) {
        Set<Integer> seenNumbers = new HashSet<>();
        Set<Integer> duplicateNumbers = new HashSet<>();

        for (int number : numbers) {
            if (!seenNumbers.add(number)) {
                duplicateNumbers.add(number);
            }
        }

        if (duplicateNumbers.isEmpty()) {
            System.out.println("No duplicate numbers found.");
        } else {
            System.out.println("Duplicate numbers: " + duplicateNumbers);
        }
    }
}




import java.util.Scanner;

public class FindAMissingNumber {
    
    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        // Calculate the sum of the series with the missing number
        int sumWithMissing = (n * (n + 1)) / 2;
        // Calculate the sum of the original series
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // The difference between the two sums will be the missing number
        return sumWithMissing - sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the series of numbers (separated by spaces): ");
        String input = scanner.nextLine();
        
        String[] numbersStr = input.split("\\s+");
        int[] series = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            series[i] = Integer.parseInt(numbersStr[i]);
        }
        
        int missingNumber = findMissingNumber(series);
        System.out.println("The missing number in the series is: " + missingNumber);
        
        scanner.close();
    }
}


import java.util.Scanner;

public class HighestIntegerInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array size
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        // Input the array elements
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the maximum value using recursion
        int max = findMax(array, 0);
        System.out.println("The maximum value in the array is: " + max);

        scanner.close();
    }

    public static int findMax(int[] array, int index) {
        // Base case: if it's the last element
        if (index == array.length - 1) {
            return array[index];
        }

        // Recursively get the maximum of the rest of the array
        int maxInRest = findMax(array, index + 1);

        // Return the maximum between the current element and the maximum of the rest
        if (array[index] > maxInRest) {
            return array[index];
        } else {
            return maxInRest;
        }
    }
}


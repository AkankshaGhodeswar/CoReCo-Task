import java.util.Arrays;
import java.util.Scanner;

public class CommonElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first array
        System.out.println("Enter the number of elements in the first array:");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input second array
        System.out.println("Enter the number of elements in the second array:");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Sort both arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Find common elements using two pointers
        int i = 0, j = 0;
        System.out.println("Common elements: ");
        boolean hasCommonElements = false;

        while (i < n1 && j < n2) {
            if (array1[i] < array2[j]) {
                i++;
            } else if (array1[i] > array2[j]) {
                j++;
            } else {
                System.out.print(array1[i] + " ");
                hasCommonElements = true;
                i++;
                j++;
            }
        }

        if (!hasCommonElements) {
            System.out.println("No common elements found.");
        }

        scanner.close();
    }
}

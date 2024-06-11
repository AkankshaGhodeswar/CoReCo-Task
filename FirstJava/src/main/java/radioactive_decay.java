import java.util.Scanner;

public class radioactive_decay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the mass of the material
        System.out.println("Enter the mass of the material (in grams):");
        double initialMass = scanner.nextDouble();

        // Input the time in years for a half life to elapse
        System.out.println("Enter the time in years for a half life to elapse:");
        double halfLifeTime = scanner.nextDouble();

        // Input the number of half lives
        System.out.println("Enter the number of half lives:");
        int numberOfHalfLives = scanner.nextInt();

        // Calculate the remaining mass and the number of years
        double remainingMass = calculateRemainingMass(initialMass, numberOfHalfLives);
        double totalYears = calculateTotalYears(halfLifeTime, numberOfHalfLives);

        // Print the results
        System.out.println("The remaining mass of the material is: " + remainingMass + " grams");
        System.out.println("The total time for the material to decay is: " + totalYears + " years");

        scanner.close();
    }

    // Function to calculate the remaining mass of the material
    public static double calculateRemainingMass(double initialMass, int numberOfHalfLives) {
        return initialMass * Math.pow(0.5, numberOfHalfLives);
    }

    // Function to calculate the total years for the material to decay
    public static double calculateTotalYears(double halfLifeTime, int numberOfHalfLives) {
        return halfLifeTime * numberOfHalfLives;
    }
}


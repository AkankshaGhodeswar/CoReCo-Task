import java.util.Scanner;

public class TeamworkTile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input your tile number
        System.out.println("Enter your tile number:");
        int yourTile = scanner.nextInt();

        // Input your friend's tile number
        System.out.println("Enter your friend's tile number:");
        int friendTile = scanner.nextInt();

        // Check if it's possible to earn a bonus
        boolean result = possibleBonus(yourTile, friendTile);
        System.out.println("Is it possible to earn a bonus? " + result);

        scanner.close();
    }

    public static boolean possibleBonus(int yourTile, int friendTile) {
        // You cannot move backward and must land exactly on your friend's tile
        if (yourTile >= friendTile) {
            return false;
        }

        // Check if you can reach your friend's tile by moving 1-6 tiles forward
        int distance = friendTile - yourTile;
        return distance <= 6;
    }
}

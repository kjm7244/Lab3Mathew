import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display the menu
            System.out.println("\n===== User Menu =====");
            System.out.println("1. Option 1 - Say Hello");
            System.out.println("2. Option 2 - Display Current Time");
            System.out.println("3. Option 3 - Exit");
            System.out.print("Please choose an option (1-3): ");

            // Read the user's choice
            choice = scanner.nextInt();

            // Perform action based on the user's choice
            switch (choice) {
                case 1:
                    System.out.println("Hello, user!");
                    break;
                case 2:
                    System.out.println("Current time: " + java.time.LocalTime.now());
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }

        } while (choice != 3);

        scanner.close();
    }
}


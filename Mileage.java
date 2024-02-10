/**
 * This program calculates the miles per gallon based on miles driven and gallons used.
 * It prompts the user to enter miles driven and gallons used, calculates the miles per gallon,
 * and then prints the result.
 */

public class Mileage {
    public static void main(String[] args) {
        // TASK #2 Create a Scanner object here
        Scanner scanner = new Scanner(System.in);

        // Print a line indicating this program will calculate mileage
        System.out.println("This program will calculate mileage.");

        // Print prompt to user asking for miles driven
        System.out.println("Enter miles driven:");

        // Read in miles driven
        double milesDriven = scanner.nextDouble();

        // Print prompt to user asking for gallons used
        System.out.println("Enter gallons used:");

        // Read in gallons used
        double gallonsUsed = scanner.nextDouble();

        // Calculate miles per gallon by dividing miles driven by gallons used
        double milesPerGallon = milesDriven / gallonsUsed;

        // Print miles per gallon along with appropriate labels
        System.out.println("Miles per gallon: " + milesPerGallon);

        // Close the scanner
        scanner.close();
    }
}
import java.util.Scanner;

/**
 * Numerical System Converter
 * Converts numbers between Decimal, Binary, Hexadecimal, and Octal bases.
 */
public class Converter {

    // Convert Decimal to all other systems
    public static void convertFromDecimal(int decimalNumber) {
        System.out.println("\n--- Conversion Results ---");
        System.out.println("Decimal:     " + decimalNumber);
        System.out.println("Binary:      " + Integer.toBinaryString(decimalNumber));
        System.out.println("Hexadecimal: " + Integer.toHexString(decimalNumber).toUpperCase());
        System.out.println("Octal:       " + Integer.toOctalString(decimalNumber));
    }

    // Convert Binary to Decimal
    public static int binaryToDecimal(String binaryStr) {
        return Integer.parseInt(binaryStr, 2);
    }

    // Convert Hexadecimal to Decimal
    public static int hexToDecimal(String hexStr) {
        return Integer.parseInt(hexStr, 16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   Numerical System Converter (Java CLI)  ");
        System.out.println("==========================================");
        System.out.println("1. Decimal to (Binary, Hex, Octal)");
        System.out.println("2. Binary to Decimal");
        System.out.println("3. Hexadecimal to Decimal");
        System.out.print("Select an option (1-3): ");

        try {
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a Decimal integer: ");
                    int dec = scanner.nextInt();
                    convertFromDecimal(dec);
                    break;
                case 2:
                    System.out.print("Enter a Binary string (e.g., 1010): ");
                    String bin = scanner.nextLine();
                    int decFromBin = binaryToDecimal(bin);
                    System.out.println("Decimal value: " + decFromBin);
                    break;
                case 3:
                    System.out.print("Enter a Hexadecimal string (e.g., 1A): ");
                    String hex = scanner.nextLine();
                    int decFromHex = hexToDecimal(hex);
                    System.out.println("Decimal value: " + decFromHex);
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format for the selected base.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input encountered.");
        } finally {
            scanner.close();
        }
    }
}

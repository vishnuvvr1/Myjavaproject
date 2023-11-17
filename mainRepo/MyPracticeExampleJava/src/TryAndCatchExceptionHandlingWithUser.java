import java.util.Scanner;

public class TryAndCatchExceptionHandlingWithUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int intInput = scanner.nextInt();

            System.out.print("Enter a string: ");
            String stringInput = scanner.next();

            if (intInput == 0 || stringInput.isEmpty()) {
                throw new IllegalArgumentException("Both inputs cannot be 0 and empty.");
            } else {
                System.out.println("Integer Input: " + intInput);
                System.out.println("String Input: " + stringInput);
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
import java.util.Scanner;

public class OopsExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int vishnu = scanner.nextInt();

        int sum = calculateSumOfDigits(vishnu);

        System.out.println("The total sum of given numbers is: " + sum);
        if (sum % 2 == 0) {
            System.out.println("Sum of the given numbers is Even ");
        } else {
            System.out.println("Sum of the given numbers is odd ");
        }
    }

    public static int calculateSumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
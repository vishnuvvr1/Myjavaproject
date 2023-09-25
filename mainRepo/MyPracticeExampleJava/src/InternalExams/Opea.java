package InternalExams;

import java.util.Scanner;

public class Opea {
    public static void main(String[] args) {
        Scanner vishnu = new Scanner(System.in);
        System.out.println("enter a first number=");
        int a = vishnu.nextInt();
        System.out.println("enter a second number=");
        int b = vishnu.nextInt();
        int c = a + b;
        if (c % 2 == 0 && c % 4 == 0) {
            System.out.println("The given numbers " + a + " and " + b + " is divisible by 2 and 4");
        } else if (c % 3 == 0 && c % 6 == 0) {
            System.out.println("The given numbers " + a + " and " + b + " is divisible by 3and 6");
        } else {
            System.out.println("The given numbers are not " + a + " and " + b + " is divisible by 2 and 4 and 3 and 6");
        }
    }
}

package InternalExams;

import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        Scanner vishnu = new Scanner(System.in);
        System.out.println("Enter a first number");
        int a = vishnu.nextInt();
        System.out.println("Enter a second number");
        int b = vishnu.nextInt();
        int c = a * b;
        int d = a + b;
        if (c > 100) {
            System.out.println("multiply of " + a + " and " + b + " is " + c);
        }
        if (d > 100) {
            System.out.println("sum of " + a + " and " + b + " is " + d);
        }
    }
}

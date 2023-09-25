package InternalExams;

import java.util.Scanner;

public class Oper2 {
    public static void main(String[] args) {
        Scanner vishnu = new Scanner(System.in);
        System.out.println("enter a first number=");
        int a = vishnu.nextInt();
        System.out.println("enter a second number=");
        int b = vishnu.nextInt();
        int c = a + b;
        if (c % 4 != 0) {
            if (c % 2 == 0) {
                System.out.println("the given number are " + a + " and " + b + " is divisible by 2");
            }else {
                System.out.println("The given numbers " + a + " and " + b + " is not divisible by 2, 4");
            }
        }
    }
}


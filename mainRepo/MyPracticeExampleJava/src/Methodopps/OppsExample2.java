package Methodopps;

import java.util.Scanner;

public class OppsExample2 {
    public static void main(String[] args) {
        Scanner vishnu = new Scanner(System.in);
        System.out.println("Enter a first number = ");
        int num1 = vishnu.nextInt();
        System.out.println("Enter a second number = ");
        int num2 = vishnu.nextInt();
        Vvr obj = new Vvr();
        obj.sum(num1, num2);
    }
}

class Vvr {
    int sum = 0;

    public void sum(int num1, int num2) {
        sum = num1 + num2;
        if (sum % 2 == 0) {
            System.out.println("Sum of the given numbers is Even ");
        } else {
            System.out.println("Sum of the given numbers is odd ");
        }
        System.out.println("sum of the given number is = " + sum);
    }
}

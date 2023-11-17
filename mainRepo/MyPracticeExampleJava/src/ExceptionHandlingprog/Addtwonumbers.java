package ExceptionHandlingprog;

import java.util.Scanner;

public class Addtwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a Number : ");
        int num1 = sc.nextInt();
        System.out.println("Please enter another Number : ");
        int num2 = sc.nextInt();
        if (num1 < 0 || num2 < 0) {
            throw new NumberException("Given Number is less than zero");
        } else {
            int sum = num1 + num2;
            System.out.println("Sum of two numbers is : " + sum);
        }
    }

}

class NumberException extends RuntimeException {
    public NumberException(String message) {
        super(message);
    }
}
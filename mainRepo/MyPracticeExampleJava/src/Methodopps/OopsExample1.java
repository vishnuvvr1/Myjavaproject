package Methodopps;

import java.util.Scanner;

public class OopsExample1 {
    public static void main(String[] args) {
        Scanner vishnu = new Scanner(System.in);
        System.out.println("Enter a first number : ");
        int num1 = vishnu.nextInt();
        System.out.println("Enter a second number : ");
        int num2 = vishnu.nextInt();
        Saif obj = new Saif();
        obj.add(num1, num2);
        obj.mult(num1, num2);
        obj.div(num1, num2);
        obj.sub(num1, num2);
        obj.mod(num1, num2);
    }

}

class Saif {
    public void add(int num1, int num2) {
        int add = num1 + num2;
        System.out.println("Addition of given number is = " + add);
    }

    public void mult(int num1, int num2) {
        int mult = num1 * num2;
        System.out.println("Multiply of given number is = " + mult);
    }

    public void div(int num1, int num2) {
        int div = num1 / num2;
        System.out.println("Divide of given number is = " + div);
    }

    public void sub(int num1, int num2) {
        int sub = num1 - num2;
        System.out.println("Subtract of given number is = " + sub);
    }

    public void mod(int num1, int num2) {
        int mod = num1 % num2;
        System.out.println("Modular division of given number is = " + mod);
    }

}
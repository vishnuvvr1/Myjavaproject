import java.util.Scanner;

public class ArrayMethodsandIntroductionto1 {
    public static void main(String[] args) {
        Scanner vishnu = new Scanner(System.in);
        System.out.println("Enter a first numbers = ");
        int num1 = vishnu.nextInt();
        System.out.println("Enter a second number = ");
        int num2 = vishnu.nextInt();
        ArrayMethodsandIntroductionto1 a1 = new ArrayMethodsandIntroductionto1();
        int Addition = a1.add(num1, num2);
        int multiply = a1.mult(num1, num2);
        int subtract = a1.sub(num1, num2);
        int modulardivision = a1.md(num1, num2);
        System.out.println("Addition of the given numbers is = " + Addition);
        System.out.println("multiply of the given numbers is = " + multiply);
        if (num2 != 0) {
            int divide = a1.div(num1, num2);
            System.out.println("divide of the given numbers is = " + divide);
        } else {
            System.out.println("can not divide by zero!");
        }
        System.out.println("subtract of the given numbers is = " + subtract);
        System.out.println("modulardivision of the given numbers is = " + modulardivision);
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int mult(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        return num1 / num2;

    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int md(int num1, int num2) {
        return num1 % num2;
    }

}
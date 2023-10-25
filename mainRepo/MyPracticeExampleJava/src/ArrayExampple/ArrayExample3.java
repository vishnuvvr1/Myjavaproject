package ArrayExampple;

import java.util.Scanner;

public class ArrayExample3 {
    public static void main(String[] args) {
        Scanner vvr = new Scanner(System.in);
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter fruite name = ");
            String a = vvr.nextLine();
            array[i] = a;
        }
        for (String var : array) {
            if (var.equalsIgnoreCase("mango")) {
                System.out.println("the given fruit name is " + var + " it is a fruit of king");
            } else {
                System.out.println("the given fruit name is " + var);
            }
        }
    }
}


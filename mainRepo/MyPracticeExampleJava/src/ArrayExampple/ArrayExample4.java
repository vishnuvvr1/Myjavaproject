package ArrayExampple;

import java.util.Scanner;

public class ArrayExample4 {
    public static void main(String[] args) {
        Scanner vvr = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("enter a five number = ");
            int a = vvr.nextInt();
            array[i] = a;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("even number = " + array[i]);
            } else {
                System.out.println(array[i] + " = is an odd number");
            }
        }
    }

}
package ArrayExampple;

import java.util.Scanner;

public class ArrayExample7 {
    public static void main(String[] args) {
        Scanner vvr = new Scanner(System.in);
        int[] array = new int[5];
        int i;
        int sum = 0;
        for (i = 0; i < array.length; i++) {
            System.out.println("enter a five number=");
            int a = vvr.nextInt();
            array[i] = a;
        }
        for (int var : array) {
            sum+=var;
        }
        System.out.println("sum of given all numbers = " + sum);
    }
}
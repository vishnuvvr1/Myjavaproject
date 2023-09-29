package ArrayExampple;

import java.util.Scanner;

public class ArrayExampleTwoDim11 {
    public static void main(String[] args) {
        Scanner vvr = new Scanner(System.in);
        int sum = 0;
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("Enter a number  values = ");
                int arr = vvr.nextInt();
                array[i][j] = arr;
                sum = sum + array[i][j];
            }
            System.out.println("Sum of all  Elements is = " + sum);

        }
    }
}
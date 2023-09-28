package ArrayExampple;

import java.util.Scanner;

public class ArrayExanmpleTwoDim12 {
    public static void main(String[] args) {
        Scanner vvr = new Scanner(System.in);
        int[][] array = new int[3][3];
        System.out.println("Enter 9 values = " );
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = vvr.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            int mult = 1;
            for (int j = 0; j < array.length; j++) {
                sum = sum + array[i][j];
                //sum +=array[i][j];
                mult *= array[i][j];
            }

            System.out.println("Sum of all the elements in the two dimensional array is = " + sum);
            System.out.println("Multiplication of all the elements in the row is = " + mult);

        }
    }
}
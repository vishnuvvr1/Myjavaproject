package ArrayExampple;

import java.util.Scanner;

public class ArrayExample13 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        for (int l = 0; l < array.length; l++) {
            for (int m = 0; m < array.length; m++) {
                System.out.print(array[l][m] + " ");
            }
            System.out.println();
        }

    }
}

package ArrayExampple;

import java.util.Scanner;

public class ArrayExample6 {
    public static void main(String[] args) {
        Scanner vvr = new Scanner(System.in);
        int[] array = new int[5];
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.println("enter a five number=");
            int a = vvr.nextInt();
            array[i] = a;
        }
        for (int var : array) {
            if (var % 2 == 0) {
                System.out.println("even numbers are " + var + " ");
            }
        }
        for (int var1 :array)
        {
            if(var1 % 2 != 0)
            {
                System.out.println("odd number" + var1 + " ");
            }
        }
    }
}

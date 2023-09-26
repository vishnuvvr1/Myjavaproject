package ArrayExampple;

import java.util.Scanner;

public class ArrayExample4 {
    public static void main(String[] args) {
        Scanner vvr = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter a five number=");
            int a = vvr.nextInt();
            array[i] = a;
        }
        for (int i = 0; i < array.length; i++) {
            //for (int var : array) {
            if (array[i] % 2 == 0) {
                int result = array[i] * 10;
                System.out.println("after multiply with 10,given number " + array[i] + "becomes" + result);
            } else {
                System.out.println(array[i] + "is an odd number");
            }
        }
    }

}
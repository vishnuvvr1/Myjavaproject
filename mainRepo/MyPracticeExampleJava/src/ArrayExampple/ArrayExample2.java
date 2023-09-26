package ArrayExampple;

import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args) {
        Scanner vvr = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter a five number=");
            int a = vvr.nextInt();
            array[i] = a;
        }
        for (int var : array) {
            System.out.println(var);
        }
    }
}

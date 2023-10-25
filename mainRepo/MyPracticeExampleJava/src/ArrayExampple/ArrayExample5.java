package ArrayExampple;

import java.util.Scanner;

public class ArrayExample5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intarray = new int[5];
        String[] stringarray = new String[5];
        for (int i = 0; i < intarray.length; i++) {
            System.out.println("enter five number=");
            intarray[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.println("enter five name=");
            stringarray[i] = scanner.nextLine();
        }
        System.out.println("interger array:");
        for (int i = 0; i < intarray.length; i++) {
            System.out.println("From Integer array =" + intarray[i]);
            System.out.println("from String array =" + stringarray[i]);
        }
    }

}


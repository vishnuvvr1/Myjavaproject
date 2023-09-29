package ArrayExampple;

import java.util.Scanner;

public class ArrayExampleTwoDim15 {
    public static void main(String[] args) {
        Scanner vishnu = new Scanner(System.in);
        String[][] stringArray = new String[3][3];
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray.length; j++) {
                System.out.print("Enter a string name = ");
                String str1 = vishnu.nextLine();
                stringArray[i][j] = str1;
                int length = str1.length();
                System.out.println("The length of the string is: " + length);
            }
        }
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray.length; j++) {
                if (stringArray[i][j].length() > 20) {
                    System.out.println("it is a length of the string = " + stringArray[i][j]);
                }
            }
        }
    }
}
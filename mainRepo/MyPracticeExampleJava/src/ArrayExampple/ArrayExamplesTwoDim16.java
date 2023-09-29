package ArrayExampple;

import java.util.Scanner;

public class ArrayExamplesTwoDim16 {
    public static void main(String[] args) {
        Scanner vishnu = new Scanner(System.in);
        String[][] stringArray = new String[3][3];
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray.length; j++) {
                System.out.print("Enter a string name = ");
                String str1 = vishnu.nextLine();
                stringArray[i][j] = str1;
            }
        }
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray.length; j++) {
                if (stringArray[i][j].contains("@") || stringArray[i][j].contains("$")) {
                    System.out.println("The given string \"" + stringArray[i][j] + "\" contains a special character.");
                } else {
                    System.out.println("it is normal string ");
                }
            }
        }
    }
}

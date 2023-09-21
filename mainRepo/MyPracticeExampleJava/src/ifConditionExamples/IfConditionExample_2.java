package ifConditionExamples;

import java.util.Scanner;

public class IfConditionExample_2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gender: ");
        String str1 = sc.nextLine();
        System.out.println(str1 + "Enter age : ");
        int a = sc.nextInt();
        if(str1.equalsIgnoreCase("m") || str1.equalsIgnoreCase("male")){

        }
        if (a > 18) {
            System.out.println("hiboy");
        } else if (a < 18) {
            System.out.println("hi man");
        } else if (str1.equalsIgnoreCase("F") || str1.equalsIgnoreCase("female")) {

        } else if (a > 18) {
            System.out.println("hi girl");

        } else if (a > 18) {
            System.out.println("hi woman");

        }
        else {
            System.out.println("please enter correct gender (M or f) or (male female)");
        }
    }

}

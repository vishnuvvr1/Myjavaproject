package ifConditionExamples;

import java.util.Scanner;

public class IfConditionExample1 {
    public static void main(String[] args) {

        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username : ");
        String str1 = sc.nextLine();
        System.out.println("Enter no of units : ");
        int a = sc.nextInt();
        // less than 100 -> 1 unit = 2rs
        //grt than 100, less than 500 -> above 100 units 1unit = 5rs
        System.out.println(str1 + " given units is : " + a);
        double cost = 0;
        double discountamount;
        if (a < 100) {
            cost = a * 2;
        } else if (a >= 100 && a <= 500) {
            cost = (100 * 2) + ((a - 100) * 5);
        } else if (a >= 500 && a <= 1000) {
            cost = (a - 500) * 10 + (a - (a - 500) - 100) * 5 + (100 * 2);
        }
        System.out.println(str1 + "Your electricity bill is:" + cost + "Rs.");
        if (cost > 2000) {
            discountamount = cost + (cost + 1 / 100);
            cost = cost - discountamount;
            System.out.println(str1 + "discount amount" + cost);
        }
    }
}
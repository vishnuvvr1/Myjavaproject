package InternalExams;
import java.util.Scanner;
public class InternalExam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of units : ");
        int a = sc.nextInt();
        String str1 = sc.nextLine();
        // System.out.println(str1 +"given units is");
        double cost = 0.0;
        double discountamount = 0.0;
        if (a < 100) {
            cost = a * 5;
        } else if (a > 750) {
            cost = (100 * 5) + ((a - 100) * 7.5);
        } else if (a >= 750 && a < 1500) {
            cost = (a - 750) * 15 + (a - (a - 650) - 100) * 7.5 + (100 * 5);
        }
        System.out.println(str1 + "your bill amount is" + cost + "rs");
        if (cost > 2500) {
            discountamount = cost + (cost * (double) 15 / 100);
            cost = cost - discountamount;
            System.out.println(str1 + "discount-amount" + cost);
        }
    }
}

package InternalExams;

import java.util.Scanner;

public class Currentbill
{
    public double cal(int u) {
        double amt = 0;
        if (u <= 100) {
            amt = 1.25 * u;
        }
        else if (u <= 200) {
            amt = 1.25 * 100 + (u - 100) * 1.5;
        }
        else {
            amt = 1.25 * 100 + 1.5 * 100 + (u - 200) * 1.8;
        }
        return amt;
    }

    public static void main(String args[]) {
        Currentbill obj = new Currentbill();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = in.nextLine();
        System.out.print("Enter Consumer No.: ");
        int cNo = in.nextInt();
        System.out.print("Enter present reading: ");
        int curr = in.nextInt();
        System.out.print("Enter previous reading: ");
        int prev = in.nextInt();
        int used = curr - prev;
        double amount = obj.cal(used);
        System.out.println("Consumer No.\tName\tUnits Consumed\tAmount");
        System.out.println(cNo + "\t\t" + name + "\t" + used + "\t" + amount);
    }
}


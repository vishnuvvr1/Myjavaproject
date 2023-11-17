package Exception_Handling;

import java.util.Scanner;

public class ExceptionsWithString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a user name : ");
        String vvr = sc.nextLine();
        if (vvr.contains("$")) {
            System.out.println("given input is not valid");
        } else {
            System.out.println("given input is valid");
        }
    }
}

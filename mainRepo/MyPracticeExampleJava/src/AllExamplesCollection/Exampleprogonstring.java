package AllExamplesCollection;

import java.util.Scanner;

public class Exampleprogonstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String : ");
        String s1 = new String(sc.nextLine());
        System.out.print("Enter the second String : ");
        String s2 = new String(sc.nextLine());
        if (s1.equals(s2 )&& s1.compareTo(s2) == 0) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are not equal");
        }
    }

}
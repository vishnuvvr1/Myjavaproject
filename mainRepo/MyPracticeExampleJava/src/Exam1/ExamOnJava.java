package Exam1;

import java.util.Scanner;

public class ExamOnJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first string :");
        String firststring = sc.nextLine();
        System.out.println("Enter a second string :");
        String secondstring = sc.nextLine();
        System.out.println("select a string from above string");
        System.out.println("1." + firststring);
        System.out.println("2." + secondstring);
        System.out.println("select a string (1,2)");
        int selecting = sc.nextInt();
        sc.nextLine();
        String choseString = (selecting == 1) ? firststring : secondstring;
        System.out.println("select operation");
        System.out.println("1. lowercase(1)");
        System.out.println("2. uppercase(2)");
        System.out.println("3. toString(3)");
        System.out.println("operation 1,2,3");
        int selectedoperation = sc.nextInt();
        switch (selectedoperation) {
            case 1:
                System.out.println("After performing the operation output is : " + choseString.toLowerCase());
                break;
            case 2:
                System.out.println("After performing the operation output is : " + choseString.toUpperCase());
                break;
            case 3:
                System.out.println("After performing the operation output is : " + choseString.toString());
                break;
            default:
                System.out.println("Invalid operation selection");
        }
    }
}
// exam problem output is :
//Enter a first string :
//vishNU
//Enter a second string :
//saIF
//select a string from above string
//1.vishNU
//  2.saIF
// select a string (1,2)
//1
//select operation
//1. lowercase(1)
//2. uppercase(2)
//3. toString(3)
//operation 1,2,3
//2
//After performing the operation output is : VISHNU

package Exam1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExamOnjavaMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> stringMap = new HashMap<>();

        for (int i = 1; i <= 2; i++) {
            System.out.print("Enter a string: ");
            String userInput = scanner.nextLine();
            stringMap.put(i, userInput);
        }

        System.out.println("Available above strings are :");
        for (Map.Entry<Integer, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
        System.out.print("Select a string (1,2): ");
        int selectedStringKey = scanner.nextInt();
        scanner.nextLine();
        String selectedString = stringMap.get(selectedStringKey);
        if (selectedString == null) {
            System.out.println("Invalid string selection.");
        } else {
            System.out.println("Select operations:");
            System.out.println("1. Lowercase(1)");
            System.out.println("2. Uppercase(2)");
            System.out.println("3. ToString(3)");
            System.out.print("Operation (1,2,3): ");
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("After performing the operation output is: " + selectedString.toLowerCase());
                    break;
                case 2:
                    System.out.println("After performing the operation output is: " + selectedString.toUpperCase());
                    break;
                case 3:
                    System.out.println("After performing the operation output is: " + selectedString.toString());
                    break;
                default:
                    System.out.println("Invalid operation selection.");
            }
        }
    }
}
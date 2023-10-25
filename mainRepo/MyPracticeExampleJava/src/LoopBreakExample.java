import java.util.Scanner;

public class LoopBreakExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (a == i) {
                break;
            }
            System.out.println("hi");
        }
    }
}

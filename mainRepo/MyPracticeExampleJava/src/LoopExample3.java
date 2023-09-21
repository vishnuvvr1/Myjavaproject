import java.util.Scanner;

public class LoopExample3 {
    public static void main(String[] args) {
        System.out.println("Enter a table number=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }
}

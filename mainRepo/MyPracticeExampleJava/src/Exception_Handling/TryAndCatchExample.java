package Exception_Handling;

public class TryAndCatchExample {
    public static void main(String[] args) {
        int a, b, c;
        try {
            a = 0;
            b = 10;
            c = b / a;
            System.out.println("This line will not be executed");
        } catch (ArithmeticException e) {
            System.out.println("Divided by zero");
        }
        System.out.println("After exception is handled");       // try and catch means if and else only like that catch block will be exceuted
        System.out.println("not possible");
    }

}

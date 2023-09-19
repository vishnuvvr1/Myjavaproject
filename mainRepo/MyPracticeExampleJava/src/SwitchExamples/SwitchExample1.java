package SwitchExamples;

public class SwitchExample1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = a + b;
        switch (c) {
            case 7:
                System.out.println("the result equal to 7 ");
                break;

            case 3:
                System.out.println("the result is not equal to 3");
                break;
            case 4:
                System.out.println("c the result is not equal to 4");
                break;
            default:
                System.out.println("the result not equal to 3 nad 4");
        }

    }
}
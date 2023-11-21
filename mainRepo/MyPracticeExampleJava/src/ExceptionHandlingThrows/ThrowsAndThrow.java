package ExceptionHandlingThrows;

public class ThrowsAndThrow {
    static void check() throws ArithmeticException { // throws example syntax this static method
        System.out.println("Inside check function");
        throw new ArithmeticException("demo");
    }

    public static void main(String args[]) {
        try {
            check();
        } catch (ArithmeticException e) {
            System.out.println("caught" + e);
        }
    }
}

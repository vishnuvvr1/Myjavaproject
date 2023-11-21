package ExceptionHandlingThrows;

public class Throws {
    static void avg() {  //  static lmethod
        try {
            throw new ArithmeticException("demo");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        } catch (NullPointerException n) {
            System.out.println("nullpointer");
        }
    }

    public static void main(String args[]) {
        avg();
    }
}

package Exception_Handling;

public class TryAndCatch2 {
    public static void main(String[] args) {
        try {
            Integer in = new Integer("abc");
            in.intValue();

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic " + e);
        } catch (NumberFormatException e) {         // integer values do not convert into string output will be number format exception
            System.out.println("Number Format Exception " + e);
        }
        catch (ArrayIndexOutOfBoundsException t){
            System.out.println(t);
        }
    }
}

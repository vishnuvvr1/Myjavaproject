package Exception_Handling;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        try {
            int a[] = new int[10];
            System.out.println(a[20]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception --> " + e);
        } catch (ArrayIndexOutOfBoundsException e) {            // in this example given value is 10 but 20 is not valid
            //  output will be Arrayindexbound exception
            System.out.println("ArrayIndexOutOfBounds Exception --> " + e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


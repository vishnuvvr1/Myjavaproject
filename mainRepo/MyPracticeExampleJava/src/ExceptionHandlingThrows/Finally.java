package ExceptionHandlingThrows;

public class Finally {

    public static void main(String[] args) {
        int a[] = new int[2];  // in the index is 2 3 element are there
        System.out.println("out of try");
        try {
            System.out.println("Access invalid element" + a[3]);  // but they printing 4 element output is
            //the above statement will throw ArrayIndexOutOfBoundException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("vishnu"); // both finally and catch block are executed
        } finally {
            System.out.println("finally is always executed.");
        }
    }
}
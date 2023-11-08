package AllExamplesCollection;

public class Passbyvalu {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        modifyValue(x);
        modifyValue(y);
        System.out.println(x); // Output will be 10, because x remains unchanged
        System.out.println(y); // Output will be 10, because x remains unchanged
    }

    public static void modifyValue(int value) {
        value = 40;
        System.out.println(value);

    }
}


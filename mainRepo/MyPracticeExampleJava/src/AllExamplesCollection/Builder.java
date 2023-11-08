package AllExamplesCollection;

public class Builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        modifyReference(str);
        System.out.println(str); // Output will be "Hello, world"
    }

    public static void modifyReference(StringBuilder reference) {
        reference.append(", world");
        reference.insert(5, " Java");
        //reference.reverse();//string means name should be reverse
    }
}

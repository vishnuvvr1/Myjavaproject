package Abstract;

public class IgnoreCase {
    public static void main(String[] args) {
        String str = new String("Vishnu");
        System.out.println(str.equalsIgnoreCase("VISHNU"));
        System.out.println(str.replace("Vi", "Si"));
    }
}

package ArrayExampple;

public class ArrayExample10 {
    public static void main(String[] args) {
        String[][] array = {{"Vishnu", "Saif", "Vardhan"}, {"Narayana", "Gowtham", "Reddy"}, {"Dog", "Cat", "Pig"}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (String[] var : array) {
                    if (var.equals("Vishnu")) {
                        System.out.println("it is " + var + "  a good name");
                    } else {
                        System.out.println("it is a bad name " + var);
                    }
                    System.out.print(array[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
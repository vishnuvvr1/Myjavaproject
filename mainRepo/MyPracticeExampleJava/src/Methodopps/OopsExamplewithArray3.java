
package Methodopps;

public class OopsExamplewithArray3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        NumberSeparator separator = new NumberSeparator();
        separator.separateNumbers(array);
    }
}

class NumberSeparator {
    public void separateNumbers(int[] array) {
        System.out.println("Even Numbers: ");
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\nOdd Numbers: ");
        for (int number : array) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }
}



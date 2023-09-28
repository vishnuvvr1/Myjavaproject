package ArrayExampple;

public class ArrayExampletwo9 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.println(array[i][j] + " = is divisible by 2 "  + "\n");
                } else {
                    System.out.println(array[i][j] + " is not divisible by 2 ");
                }
            }
        }
    }
}

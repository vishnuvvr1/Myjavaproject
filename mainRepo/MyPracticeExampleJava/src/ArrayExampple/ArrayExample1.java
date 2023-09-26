package ArrayExampple;

public class ArrayExample1 {
    public static void main(String[] args) {

        int[] vvr = {10, 20, 30, 40, 50};
        for (int i = 0; i < vvr.length; i++) {
            System.out.println(vvr[i]);//inti
        }
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = 10;
            System.out.println(array[i]);//decr
        }
    }
}


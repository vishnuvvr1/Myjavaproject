package AllExamplesCollection;

import java.util.HashMap;

public class Map1 {
    public static void main(String[] args) {
        HashMap<String, Integer> h1 = new HashMap<>();
        h1.put("Apple", 100);
        h1.put("Reddy", 100);
        h1.put(null, 200);
        System.out.println(h1);
        for (int I : h1.values()) {
            System.out.println(I);

        }
    }
}

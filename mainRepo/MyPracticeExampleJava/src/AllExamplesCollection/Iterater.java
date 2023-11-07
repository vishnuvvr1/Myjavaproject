package AllExamplesCollection;

import java.util.*;

public class Iterater {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("ab");
        ar.add("bc");
        ar.add("cd");
        ar.add("de");
        System.out.println(ar);
        ar.remove(2);
        System.out.println(ar);
        Iterator<String> iterator = ar.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
        System.out.println(" ");
        for (String s : ar) {
            System.out.println(s);

        }
        // Iterator it = ar.iterator();
        //while (it.hasNext()) {
        //  System.out.print(ar + " ");
    }
}
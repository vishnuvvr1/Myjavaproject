package AllExamplesCollection;

import java.util.*;

public class Inter {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("vishnu");
        ar.add("saif");
        ar.add("reddy");
        ar.add("chudu");
        System.out.println(ar);
        ar.remove(2);
        System.out.println(ar);
        ListIterator<String> litr = ar.listIterator();
        while (litr.hasNext())   //In forward direction
        {
            System.out.print(litr.next() + " ");
        }
        System.out.print("\n");
        while (litr.hasPrevious())   //In backward direction
        {
            System.out.print(litr.previous() + " ");
        }
        System.out.println("\n");
        for (String s : ar)
            System.out.println(s);
        {

        }
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
    }
}

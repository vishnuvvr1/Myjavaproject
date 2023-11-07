package AllExamplesCollection;

import java.util.*;

public class Sort {

    public static void main(String a[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(2);
        list.add(66);
        list.add(22);
        list.add(10);
        list.add(2000);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        int min = Collections.min(list);
        System.out.println("min : " + min);
        int max = Collections.max(list);
        System.out.println("max : " + max);
        Collections.reverse(list);
        System.out.println(list);
        Collections.swap(list, 0, 3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        for (Integer i : list)
            System.out.println(i);
        {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

    }

}

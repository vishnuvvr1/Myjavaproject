package AutoBoxing;

import java.util.ArrayList;

public class AutoBoxingExample3 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100); // autoboxing int to Integer
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        for (Object i : arrayList) {
            System.out.println(i);
        }
        // unboxing Integer to int type
        int first = (int) arrayList.get(0);
        System.out.println("int value " + first);
        int third = (int) arrayList.get(3); // get(3) index of the value
        System.out.println("int value " + third);
        Integer second = (Integer) arrayList.get(2); // casting
        System.out.println("int value " + second);// Integer (or) int both are possible

    }
}


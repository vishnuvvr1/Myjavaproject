package AutoBoxing;

import java.util.ArrayList;

public class AutoBoxingExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100); // autoboxing int to Integer
        arrayList.add(200);// Autoboxing converting into  wrapper class Integer type
        arrayList.add(300);
        arrayList.add(10000);
        arrayList.add(1025);
        arrayList.remove(3);
        for (Integer i : arrayList) {
            System.out.println(i);
        }
        arrayList.clear();
        System.out.println("\n");
        for (int i = 0; i < arrayList.size(); i++) {   // collection of arraylist use for loop (or) for each loop
            System.out.println(arrayList.get(i));
        }
    }
}

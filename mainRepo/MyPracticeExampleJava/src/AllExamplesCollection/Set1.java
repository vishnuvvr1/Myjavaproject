package AllExamplesCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("banana");
        stringList.add("date");
        stringList.add("cherry");
        System.out.println(stringList);

        Set<String> stringSet = new HashSet<>(stringList);

        if (stringList.size() == stringSet.size()) {
            System.out.println("No duplicate values found in the list.");
        } else {
            System.out.println("Duplicate values were found in the list.");
        }
        System.out.println("Set: " + stringSet);
    }
}


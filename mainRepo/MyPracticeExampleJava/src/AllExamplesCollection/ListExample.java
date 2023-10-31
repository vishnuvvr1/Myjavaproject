package AllExamplesCollection;

import java.net.InterfaceAddress;
import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList();
        a1.add("vishnu");
        a1.add(null);
        a1.add("vishnu");
        a1.add(2,"vvr");
        System.out.println(a1);
        for(String P:a1){
            System.out.println(P);
        }
    }
}

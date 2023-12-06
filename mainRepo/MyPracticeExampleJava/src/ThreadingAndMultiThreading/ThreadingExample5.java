package ThreadingAndMultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadingExample5 {
    public static void main(String[] args) {
        List obj = new ArrayList<>();
        Random obj1 = new Random();
        while (true)
            obj.add(obj1.nextInt());
    }
}


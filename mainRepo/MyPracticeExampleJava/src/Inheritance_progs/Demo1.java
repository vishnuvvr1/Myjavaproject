package Inheritance_progs;

public class Demo1 {
    void sum(int l, long b) {
        System.out.println("Sum is" + (l + b));
    }

    void sum(int l, int b, int h) {
        System.out.println("Sum is" + (l + b + h));
    }
    public static void main(String[] args) {
        Demo1 ar = new Demo1();
        ar.sum(8, 5); // Result is 13
    }
}


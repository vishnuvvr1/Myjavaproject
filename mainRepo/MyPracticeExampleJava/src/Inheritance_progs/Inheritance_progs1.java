package Inheritance_progs;

public class Inheritance_progs1 {
    public static void main(String[] args) {
        Prog3 p1 = new Prog3();
        p1.m1();
        p1.m2();
        p1.m3();
    }
}

class Prog1 {
    public void m1() {
        System.out.println("Prog1");
    }
}

class Prog2 extends Prog1 {
    public void m2() {
        System.out.println("Prog2");
    }
}

class Prog3 extends Prog2 {
    public void m3() {
        System.out.println("Prog3");
    }
}



package Inheritance_progs;


public class Inheritance_progs2 {
    public static void main(String[] args) {
        D d1 = new D();
        d1.sum(10, 20);
        d1.mult(10, 20);
        d1.div(10, 20);
        d1.mod(10, 20);
    }
}

class A {
    public void sum(int x, int y) {
        System.out.println("sum of the two numbers = " + (x + y));
    }
}

class B extends A {
    public void mult(int x, int y) {
        System.out.println("mult of the numbers " + x * y);
    }
}

class C extends B {
    public void div(int x, int y) {
        System.out.println("div of the number " + x / y);
    }
}

class D extends C {
    public void mod(int x, int y) {
        System.out.println("mod of the numbers " + x % y);
    }
}

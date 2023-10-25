package AllExamplesCollection;

public class Downcasting {
    void m1() {
        System.out.println("m1 of A ");
    }

    void m2() {
        System.out.println("m2 of A ");
    }
}

class Collection23 extends Downcasting {
    void m3() {
        System.out.println("m3 of A ");
    }

    void m4() {
        System.out.println("m4 of A ");
    }
}

class Collection32 extends Collection23 {
    void m5() {
        System.out.println("m5 of A ");
    }

    void m6() {
        System.out.println("m6 of A ");
    }


    public static void main(String[] args) {
        Object o1 = new Collection32();
    }


}

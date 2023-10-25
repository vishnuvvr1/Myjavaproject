package AllDemoExamples.InheritanceConcepts;

class Demo2 {
    void sum(int a, int b) {    // two int parameter
        System.out.println("sum is = " + (a + b));
    }

    void sum(float a, float b) {    //two float parameter
        System.out.println("sum is = " + (a + b));
    }

    void mult(int a, float b) {     //both are different parameter
        System.out.println("mult is = " + (a * b));
    }

    void sum(int l, int b, int h) {     //three int parameter
        System.out.println("mult of the l*b*h = " + (l * b * h));

    }

    void length(int l, long b) {    //both are different parameter
        System.out.println("sum of the two number is " + (l + b));
    }

    public static void main(String[] args) {
        Demo2 obj = new Demo2();
        obj.sum(8, 5);      //sum(int a, int b) is method is called.
        obj.sum(4.6f, 3.8f); //sum(float a, float b) is called.
        obj.mult(12, 6.25f);
        obj.sum(4, 5, 6);
        obj.length(8, 5);
    }
}


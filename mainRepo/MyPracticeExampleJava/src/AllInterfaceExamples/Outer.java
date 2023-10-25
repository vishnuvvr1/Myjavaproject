package AllInterfaceExamples;

public class Outer {
    public void display() {
        System.out.println("vishnu");
        Inner in = new Inner();
        in.show();
    }

    class Inner {
        public void show() {
            System.out.println("Inside inner");
        }
    }
}

class Test {
    public static void main(String[] args) {
        Outer ot = new Outer();
        ot.display();


    }
}

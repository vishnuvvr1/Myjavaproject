package AllDemoExamples.InheritanceConcepts;

import Inheritance_progs.Demo;

public class Demo1 {

    public static void main(int args) {
        System.out.println("main method is Integer");
        System.out.println(args);


    }

    public static void main(char args) {
        System.out.println("main method is char");
        System.out.println(args);


    }

    public static void main(double args) {
        System.out.println("main method is double");
        System.out.println(args);


    }

    public static void main(String[] args) {
        Demo1.main(120);
        Demo1.main('v');
        Demo1.main(1.035);


    }


}

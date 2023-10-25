
package AllDemoExamples.InheritanceConcepts;

public class Demo4 {
    public void test(Integer i) {
        System.out.println("test(Integer ) ");
    }

    public void test(String name) {
        System.out.println("test(String ) ");
    }

    public static void main(String[] args) {
        Demo4 obj = new Demo4();
        //obj.test(null);   //Ambiguous method problem
        String a=null;
        obj.test(a);
        Integer b=null;
        obj.test(120);
    }
}


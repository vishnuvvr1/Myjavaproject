package AllExamplesCollection;

public class Collection1 {
    void m1() {
        System.out.println("m1 of A ");
    }

    void m2() {
        System.out.println("m2 of A ");
    }
}

    class Collection2 extends Collection1 {
        void m3() {
            System.out.println("m3 of A ");
        }

        void m4() {
            System.out.println("m4 of A ");
        }
    }

    class Collection3 extends Collection2 {
        void m5() {
            System.out.println("m5 of A ");
        }

        void m6() {
            System.out.println("m6 of A ");
        }


        public static void main(String[] args) {
            Collection3 obj = new Collection3();
            obj.m1();
            obj.m2();
            obj.m3();
            obj.m4();
            obj.m5();
            obj.m6();
            int a=obj.hashCode();
            obj.m1();
            System.out.println(a);
Collection1 coll =(Collection1) obj;
coll.m1();
coll.m2();
        }
    }



package AutoBoxing;

public class AutoBoxingExample4 {
    public static void main(String args[]) {
        Integer i = 35;
        Double d = 33.3;
        d = d + i;   // integer has convert into double that is wrapper class
        Double a = 22.7;
        Integer v = 20;
        v = (int) (v + a);// here cast typing is done (or) cast expression is done
        Long b = 123456789L;
        Integer n = 123;
        b = b + n;// here long to int is possible to the wrapper class
        Double vv = 22.3;
        Long cc = 123456789L;
        vv = vv + cc;// here long to double to the wrapper class
        System.out.println(vv);
        System.out.println(b);
        Character ch = 'a';
        System.out.println(ch + Character.toUpperCase(ch));  // output is a 162 means 65+97 double add
        System.out.println(ch);  // output is A and 130 means 65+65 double add
        System.out.println(v);
        System.out.println("Value of d is " + d);
    }
}


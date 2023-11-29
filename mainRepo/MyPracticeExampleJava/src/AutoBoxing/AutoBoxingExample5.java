package AutoBoxing;

public class AutoBoxingExample5 {
    public static void main(String[] args) {
        int i=1000;
        System.out.println(i);
        Integer j= new Integer(i);// boxing
        System.out.println(j);
        int k=j.intValue();// unboxing
        System.out.println(k);
        Integer p= 123;// autoboxing
        System.out.println(p);
        int q=p;
        System.out.println(q);
    }
}

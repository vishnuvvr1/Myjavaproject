package AutoBoxing;

import javax.jws.soap.SOAPBinding;

public class AutoBoxingExample1 {
    public static void main(String[] args) {
        Integer i = 100;
        System.out.println(i);
        Character ch = 'v';
        System.out.println(ch);  // Auto-boxing of int is converting to primitive datatype into wrapper clas Integer type
        Byte b = 12;
        System.out.println(b);
        String str = "vishnu";
        System.out.println(str);
    }
}

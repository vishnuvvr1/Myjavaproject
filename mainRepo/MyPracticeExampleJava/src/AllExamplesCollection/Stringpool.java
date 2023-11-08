package AllExamplesCollection;

public class Stringpool {
    public static void main(String[] args) {
        String str = "hello world";//normal string
        String string1 = new String("hello world"); // new object created and go to string pool
        System.out.println(string1);
        System.out.println(str);
        String st1 = "vishnu";
        String s = "reddy";
        String string = st1.concat(s);// both st1 and s are concat the string store in single string object
        System.out.println(string);
        string = st1 + s;// + operater has concat the both string
        System.out.println(string);
        string = st1 + 10;// + operater has concat the both integer and string values
        System.out.println(string);
        boolean b = st1.equals(s);// boolean means string both are sam output should be true
        // aitherwise output should be false that is called equals operater
        System.out.println(b);

        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        boolean a = (s1 == s2); // == operater compare to two string are sam output will be true both are not sam out will be not sam
        System.out.println(a);
        boolean c = (s1 == s3);
        System.out.println(c); // == operater compare to flase because s1 and s3 both are not sam s3 new object thase
        // way false will be get
    }
}

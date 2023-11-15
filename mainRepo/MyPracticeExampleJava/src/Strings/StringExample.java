package Strings;

public class StringExample {
    public static void main(String[] args) {
        String str = "vishnu vardhan reddy";
        System.out.println(str.charAt(2));  // charAt means that indexof number  output is = s;
        String str1 = "java";
        System.out.println(str1.equalsIgnoreCase("JAVA")); //equalsIgnoreCase means it will show true or false only
        // true means both are equal false means both are not equal.
        String st = "vishnu vardhan reddy";
        System.out.println(st.length());// length means we have to find length of the string
        String stri = " ";
        System.out.println(stri.isEmpty()); // output is false because they is no any string name.
        // string name is there output will be true.
        String str3 = "ababab";
        System.out.println(str3.replace('a', 'b'));// replace means oldchar as cange to new char in place a , b will be cam
        String str2 = "0123456789";
        String str4 = "vishnu";
        System.out.println(str2.substring(4));
        System.out.println(str2.substring(4, 7));  // substring means return the value from given index to end index the string
        System.out.println(str4.substring(2));
        System.out.println(str4.substring(2, 6));// substring means 2 means starting index and 6 means last index
        String str5 = "ABCDEF";
        System.out.println(str5.toLowerCase()); // Lower case means upper case value comes in lower case
        String str6 = "abcdef";
        System.out.println(str6.toUpperCase());//  upper case means lower case value comes in upper case
        String str7 = "narayanacollege";
        int index = str7.indexOf("a");
        System.out.println(index);//index of method will return indexOf string name indexof value will give the number
        String str8 = "narayanacollege";
        int index1 = str8.lastIndexOf("l");
        System.out.println(index1);//index of method will return indexOf string name indexof value will give the number


    }
}



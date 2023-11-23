package StringExamples;

public class Trim {
    public static void main(String[] args) {
        String str = "   hello  ";
        System.out.println(str.trim());// trim method has just remove the space and given the output.

        String a = "Hello welcome to studytonight.com";
        System.out.println(a.endsWith("m"));// this method is endswith meas laster name are chracter any thing
        // is there output will be true is not there output will be false
        System.out.println(a.endsWith("com"));
        System.out.println(a.endsWith("n"));


        System.out.println("\n");
        String str1 = "studytonight";
        System.out.println(str1.startsWith("s"));// this method is start with starting letter and get the output is true and false
        System.out.println(str1.startsWith("t"));
        System.out.println(str1.startsWith("study", 1));

        System.out.println("\n");
        String s = String.join("*", "Welcome to studytonight.com");
        System.out.println(s);
        String date1 = String.join("/", "23", "11", "2023");
        System.out.println("Date: " + date1);// join means string values are join using by method name is join
        String time1 = String.join(":", "12", "20", "35");
        System.out.println("Time: " + time1);

        System.out.println("\n");
        String av = "studytonight"; // get bytes means ascii values printing the output
        byte[] b = av.getBytes();// ascii values as printing the output s-> ascii value is 115
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }


    }
}
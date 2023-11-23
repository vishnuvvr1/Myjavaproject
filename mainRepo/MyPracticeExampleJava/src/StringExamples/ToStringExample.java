package StringExamples;

public class ToStringExample {
    public static void main(String args[]) {
        ToStringExample a = new ToStringExample();
        System.out.println(a);
    }

    public String toString() {
        return "This is my car object";
    }// to string method return the object of that class
    //tostring method only the string name
}
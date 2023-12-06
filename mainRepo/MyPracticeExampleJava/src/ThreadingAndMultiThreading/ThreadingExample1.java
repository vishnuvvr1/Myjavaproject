package ThreadingAndMultiThreading;

public class ThreadingExample1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        Thread tt = Thread.currentThread();
        t.setName("saif");
        System.out.println("my name is : " + t);
        tt.setName("vishnu");
        System.out.println("my name is : " + tt);
    }
}

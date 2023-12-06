package ThreadingAndMultiThreading;

public class ThreadingExample7 extends Thread {
    public void run() {
        System.out.println("r1 ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {

        }
        System.out.println("r2 ");
    }

    public static void main(String[] args) {
        ThreadingExample7 t1 = new ThreadingExample7();
        ThreadingExample7 t2 = new ThreadingExample7();
        t1.start();
        t2.start();
        t1.run();
        t1.getName();
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
    }
}
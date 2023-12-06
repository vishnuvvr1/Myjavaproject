package ThreadingAndMultiThreading;

class MyThread implements Runnable {  // interface will be created and implements the method
    public void run() {
        System.out.println("concurrent thread started running..");
    }
}

 public class ThreadingExample2 {
    public static void main(String[] args) {
        myThread mt = new myThread();  // constructor instance variable object will be created
        Thread t = new Thread(mt);
        //mt.run();
        t.start();
        // here we call the t.start() (or) mt.run() both are sam output will be sam
    }
}

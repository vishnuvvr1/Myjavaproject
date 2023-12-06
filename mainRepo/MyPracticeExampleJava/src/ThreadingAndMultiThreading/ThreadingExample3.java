package ThreadingAndMultiThreading;

class myThread extends Thread {  // interface will be created and implements the method
    // runnable and thread both sam
    public void run() {
        System.out.println("concurrent thread started running..");
    }
}

public class ThreadingExample3 {
    public static void main(String[] args) {
        myThread mt = new myThread();  // constructor instance variable object will be created

        mt.start();
        // here we call the t.start() (or) mt.run() both are sam output will be sam
    }
}


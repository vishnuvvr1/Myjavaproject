package ThreadingAndMultiThreading;

public class ThreadingExample4 {
    public static void main(String[] args) throws Exception {

        Runtime obj = Runtime.getRuntime();
        obj.addShutdownHook(new Demo());
        System.out.println("Now main method is sleeping... For Exit press ctrl+c");
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
        }
    }
}

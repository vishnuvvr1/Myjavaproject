package Abstract;

 abstract class Method {
    public abstract void engine();
}
 class Cars extends Method {

    public void engine() {
        System.out.println("Car engine");
    }

    public static void main(String[] args) {
        Method v = new Cars();
        v.engine();
    }
}

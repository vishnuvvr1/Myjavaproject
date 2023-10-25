package Abstract;

public abstract class Show {
    abstract void callme();

    public void show() {
        System.out.println("this is non-abstract method");
    }
}

class Bad extends Show {
    void callme() {
        System.out.println("Calling...");
    }

    public static void main(String[] args) {
        Bad b = new Bad();
        b.callme();
        b.show();

}
}
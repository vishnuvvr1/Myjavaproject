package Abstract;

public abstract class Abstractmethods {
    abstract void callme();
}

class Boy extends Abstractmethods {
    void callme() {
        System.out.println("my class name is AbstractMethod");
    }

    public static void main(String[] args) {
        Boy obj= new Boy();
        obj.callme();
    }
}


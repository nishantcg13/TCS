abstract class Parent {
    abstract Object fun();
}

public class Poly1 extends Parent {
    String fun() {
        return "Hello";
    }

    public static void main(String[] args) {
        Parent pr = new Poly1();
        pr.fun();
    }
}

public class Inherit extends Parent {
    Inherit() {
        System.out.println("IN child");
        System.out.println(super.x);
    }

    int x = 20;

    public static void main(String[] args) {
        Inherit inh = new Inherit();
        System.out.println(inh.x);
    }
}

class Parent {
    int x = 10;

    Parent() {
        System.out.println("IN parent");
    }
}

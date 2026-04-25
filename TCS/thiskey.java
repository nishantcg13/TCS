public class thiskey extends Parent {
    thiskey() {
        this(10);
        System.out.println(this);
        System.out.println("IN default");
    }

    
    thiskey(int x) {
        System.out.println("In para");
    }

    public static void main(String[] args) {
        thiskey ts = new thiskey();
    }

}

class Parent {
    Parent() {
        System.out.println("in parent");
    }
}

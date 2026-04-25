class Parent {
    static void fun() {
        System.out.println("In Parent");
    }
}

public class Test12 extends Parent {
    Test12() {
        System.out.println("In cosst");
        super.fun();
    }

    static void fun() {

        System.out.println("In child");
    }

    public static void main(String[] args) {

        Parent p = new Parent();
        Test12 t = new Test12();
        Parent p1 = new Test12();

        // p.fun();
        // t.fun();
        // p1.fun();

    }
}

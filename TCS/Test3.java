public class Test3 extends Object {

    Integer x = 10;

    Test3() {
    }

    Test3(int x) {
        System.out.println("In Constructor");
        System.out.println(x + "In const");
        System.out.println(this.x + "In const of global");
    }

    void fun() {
        System.out.println(x + "fun method");
    }

    public static void main(String[] args) {
        Test3 obj1 = new Test3(10);
        Test3 obj2 = new Test3(10);

        System.out.println(obj1.x);
        System.out.println(obj2.x);

        obj1.fun();
        obj2.fun();

        obj1.x = 50;

        System.out.println(obj1.x);
        System.out.println(obj2.x);

    }
}

class Test4 extends Test3 {
    
}
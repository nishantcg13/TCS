public class Test5 {
    public static void main(String[] args) {

        Demo demo = new Demo(20);
        demo.fun();

    }
}

class Demo {
    int x = 10;

    Demo(int x) {
        System.out.println("Inn demo");
    }

    void fun() {
        System.out.println(x);
    }
}

class Demo {
    void fun() {
        System.out.println("In fun");
    }
}

public class AnoInnerClass {

    public static void main(String[] args) {
        new Demo() {
            void run() {
                fun();
                System.out.println("in run");
            }
        }.run();
    }

}
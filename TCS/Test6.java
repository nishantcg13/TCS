interface A {
    void show();
}

interface B {
    void show();
}

public class Test6 implements A, B {
    
    public void show() {
        System.out.println("Resolved here");
    }

    public static void main(String[] args) {
        Test6 obj = new Test6();
        obj.show();   // calling method
    }
}
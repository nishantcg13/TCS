public class Poly {
    void fun(int x, float y) {
        System.out.println(x + " int");
        System.out.println(y + " float");
    }

    void fun(float x, int y) {
        System.out.println(x + " float");
        System.out.println(y + " int");
    }

    public static void main(String[] args) {
        Poly obj = new Poly();
        obj.fun(10f, 20);
        obj.fun(20, 10f);
    }
}

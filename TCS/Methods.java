public class Methods {
    public static void main(String[] args) {
        run('a', 'b');
        // run(10, 11);

        fun(10.6, 11.6f);
        // run();
    }

    public static void run(char a, char b) {
        System.out.println(a);
        System.out.println(b);
    }

    public static void fun(double a, float b) {
        System.out.println(a);
        System.out.println(b);
    }
}
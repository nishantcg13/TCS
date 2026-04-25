public class Intcache {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        Integer x = 200;
        Integer y = 200;

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));
        // System.out.println(x==y);
    }
}

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<Integer>();
        v1.add(10);
        v1.add(20);
        v1.add(20);
        System.out.println(v1.capacity());
        System.out.println(v1);
    }
}

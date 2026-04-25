import java.util.ArrayList;
import java.util.Iterator;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            al.add(i * 10);
        }

        Iterator<Integer> i = al.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // for (Object a : al) {
        // System.out.println(a);
        // }
    }
}
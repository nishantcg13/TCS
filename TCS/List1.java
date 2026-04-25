import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List1 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            l1.add(i * 10);
        }

        ListIterator<Integer> l = l1.listIterator();

        while (l.hasNext()) {
            System.out.println(l.next());
        }
        l.remove();
        while (l.hasPrevious()) {
            System.out.println(l.previous());
        }
    }
}

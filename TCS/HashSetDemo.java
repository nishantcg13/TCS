import java.util.HashSet;
import java.util.PriorityQueue;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            hs.add(i * 10);
        }
        System.out.println(hs);
        PriorityQueue<Object> pq = new PriorityQueue<>();
    }
}

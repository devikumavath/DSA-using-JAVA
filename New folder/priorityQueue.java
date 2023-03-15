import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(23);
        pq.offer(12);
        pq.offer(100);

        System.out.println(pq);

        pq.poll();

        System.out.println(pq);

        System.out.println(pq.peek());

        
    }
    
}

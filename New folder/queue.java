import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {
        // queue (FIFO)
        Queue<Integer> queue = new LinkedList<>();

        // offer -- to add insert element in the queue
        // or add() method -- it will throw exception
        queue.offer(12);
        queue.offer(2);
        queue.offer(13);
        queue.offer(18);

        System.out.println(queue);

        // poll -- to delete and return the element
        // or remove() it will throw exception if empty
        System.out.println(queue.poll());

        // peek --
        // or element() it will throw exception if empty
        System.out.println(queue.peek());

    }
}

import java.util.*;
public class deque {
    //double  ended queue -- can remove , peek  and add element from both side 
    
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(3);
        adq.offer(4);

        System.out.println(adq);

        adq.offerFirst(1);
        adq.offerFirst(0);

        System.out.println(adq);

        adq.offerLast(10);
        adq.offerLast(34);

        System.out.println(adq);


        System.out.println(adq.poll());

        System.out.println(adq.pollFirst());

        System.out.println(adq.pollLast());

        System.out.println(adq.peek());

        System.out.println(adq.peekFirst());

        System.out.println(adq.peekLast());










        
    }
}

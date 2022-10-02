import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueuee {
    public static void main(String []args){


        Queue<Integer> pq = new PriorityQueue<>();
       // reverse number
        // Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(22);
        pq.offer(99);
        pq.offer(44);
        pq.offer(8);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}

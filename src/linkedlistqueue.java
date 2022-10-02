import java.util.LinkedList;
import java.util.Queue;

public class linkedlistqueue {
    public static void main(String []args){

        Queue<Integer> abc = new LinkedList<>();

        abc.offer(22);
        abc.offer(23);
        abc.offer(44);
        abc.offer(66);

        System.out.println(abc);

        System.out.println(abc.poll());
        System.out.println(abc);

        System.out.println(abc.peek());

    }
}

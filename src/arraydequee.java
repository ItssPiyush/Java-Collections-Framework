import java.util.ArrayDeque;
public class arraydequee {
    public static void main (String[]args){

        ArrayDeque<Integer> abc = new ArrayDeque<>();
         abc.offer(22);
         abc.offerFirst(44);
         abc.offerLast(55);
        System.out.println(abc);

        System.out.println(abc.peek());
        System.out.println(abc.peekFirst());
        System.out.println(abc.peekLast());

        System.out.println(abc.poll());
        System.out.println("poll() " + abc);

        System.out.println(abc.pollFirst());
        System.out.println("poll() " + abc);

        System.out.println(abc.pollLast());
        System.out.println("poll() " + abc);


    }
}

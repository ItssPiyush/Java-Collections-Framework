import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collector;

public class collectionclassss {
    public static void main(String []args){
        ArrayList<Integer> abc = new ArrayList<>();

        abc.add(32);
        abc.add(36);
        abc.add(54);
        abc.add(54);
        abc.add(54);
        abc.add(54);
        abc.add(34);
        System.out.println("min elemnet: " + Collections.min(abc));
        System.out.println("max element: "+ Collections.max(abc));
        System.out.println(Collections.frequency(abc,54));

        Collections.sort(abc , Comparator.reverseOrder() );
        System.out.println(abc);

    }

}

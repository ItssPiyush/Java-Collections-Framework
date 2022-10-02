import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class settts {
    public static void main (String [ ]args){
  //       Set<Integer> abc = new HashSet<>();
  //      Set<Integer> abc = new LinkedHashSet<>();
        Set<Integer> abc = new TreeSet<>();

         abc.add(22);
         abc.add(72);
         abc.add(52);
         abc.add(62);
        System.out.println(abc);

        abc.remove(22);
        System.out.println(abc);

        System.out.println(abc.contains(72 ));

        System.out.println(abc.isEmpty());
        System.out.println(abc.size());
        abc.clear();

        System.out.println(abc);

    }
}

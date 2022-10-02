import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String [] args){

        List<Integer> list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(3,22);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("the element is " +  list.get(i));
            
        }
        for (Integer abc: list){
            System.out.println("foreachloop" + abc );
        }
        Iterator<Integer> abc = list.iterator();

        while(abc.hasNext()){
            System.out.println("iterator" + abc.next());
        }
       // list.remove(2);
//        System.out.println(list);
//
//        List<Integer> newlist = new ArrayList();
//        newlist.add(150);
//        newlist.add(200);
//
//        list.addAll(newlist);
//
//        list.remove(Integer.valueOf(22));
//        list.set(2,66);
//        //list.clear();
//        System.out.println(list);


      //  System.out.println(list.get(4));

    }
}

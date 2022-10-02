import java.util.Arrays;

public class arrasyssclass {
    public static void main(String []args){
         int[] num = { 1,3,2,5,3,6,23,5,34,23,23};
//         int index = Arrays.binarySearch(num , 34);
//        System.out.println("the elemnt of array index is:" + index);
        Arrays.sort(num);
        Arrays.fill(num , 12);
        for(int i : num)
        System.out.print(i + " ");


    }
}

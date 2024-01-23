package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectExc {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();

        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6);
        arrayList.addAll(integerList);
        Iterator<Integer> integerIterator= arrayList.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
            integerIterator.remove();
        }
        System.out.println(arrayList);

    }
}

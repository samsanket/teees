package collections_Example;

import java.util.*;

public class ListAndSetEx {

    public static void main(String[] args) {

        ArrayList<Integer> integersList = new ArrayList<>();
        integersList.add(1);
        integersList.add(100);
        integersList.add(-1);
        integersList.add(-200);
        integersList.add(80);
        integersList.add(2);
        integersList.add(3);
        integersList.add(null);
        integersList.add(null);

        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(1);
        integerTreeSet.add(100);
        integerTreeSet.add(-1);
        integerTreeSet.add(-200);
        integerTreeSet.add(80);
        integerTreeSet.add(2);
        integerTreeSet.add(3);
//        integerTreeSet.add(null);
//        integerTreeSet.add(null);
        System.out.println("Integer List");

        integersList.forEach(System.out::println);


        System.out.println("integer treee set ");

        integerTreeSet.forEach(System.out::println);


        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(1);
        integerHashSet.add(100);
        integerHashSet.add(-1);
        integerHashSet.add(-200);
        integerHashSet.add(80);
        integerHashSet.add(2);
        integerHashSet.add(3);
        integerHashSet.add(null);
        integerHashSet.add(null);

        System.out.println("integerHashSet  set ");

        integerHashSet.forEach(System.out::println);



        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>();
        integerLinkedHashSet.add(1);
        integerLinkedHashSet.add(100);
        integerLinkedHashSet.add(-1);
        integerLinkedHashSet.add(-200);
        integerLinkedHashSet.add(80);
        integerLinkedHashSet.add(2);
        integerLinkedHashSet.add(3);
        integerLinkedHashSet.add(null);
        integerLinkedHashSet.add(null);

        System.out.println("integerLinkedHashSet  set ");

        integerLinkedHashSet.forEach(System.out::println);

    }
}
//
//Integer List
//        1
//        100
//        -1
//        -200
//        80
//        2
//        3
//integer treee set
//       -200
//        -1
//        1
//        2
//        3
//        80
//        100
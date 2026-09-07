package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class part_1 {
    static void main(String[] args) {
        //List or collection -> interface

        //Arraylist -> concrete class
       ArrayList<Integer> list = new ArrayList<>();

       //add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        //addAll
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(50);
        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //clear
        System.out.println("Printing list2 : " + list2);
        list2.clear();
        System.out.println(list2.size());

        //i want to traverse list using iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("Element : " + iterator.next());
        }

        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);
        System.out.println(list3.get(0));
        System.out.println("Before set : " + list3);
        list3.set(0,100);
        System.out.println("After set : " + list3);

//        Collection<Integer> collection = new ArrayList<>();
    }
}

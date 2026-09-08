package CollectionFramework;

import java.util.*;

public class part_1 {
    static void main(String[] args) {
        //List or collection -> interface

        //Arraylist -> concrete class
//       ArrayList<Integer> list = new ArrayList<>();
//        List<Integer> list = new LinkedList<>();
//        List<Integer> list = new Vector<>();
//        List<Integer> list = new Stack<>();

        //add
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println(list);
//        list.add(40);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);

        //addAll
//        List<Integer> list2 = new ArrayList<>();
//        List<Integer> list2 = new LinkedList<>();
//        List<Integer> list2 = new Vector<>();
//        List<Integer> list2 = new Stack<>();
//        list2.add(101);
//        list2.add(102);
//        list2.add(50);
//        list.addAll(list2);
//        System.out.println(list);
//        list.removeAll(list2);
//        System.out.println(list);

        //size
//        System.out.println(list.size());

        //clear
//        System.out.println("Printing list2 : " + list2);
//        list2.clear();
//        System.out.println(list2.size());

//        i want to traverse list using iterator
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println("Element : " + iterator.next());
//    }

//        List<Integer> list3 = new LinkedList<>();
//        List<Integer> list3 = new Vector<>();
//        List<Integer> list3 = new Stack<>();
//        list3.add(11);
//        list3.add(12);
//        list3.add(14);
//        System.out.println(list3.get(0));
//        System.out.println("Before set : " + list3);
//        list3.set(0,100);
//        System.out.println("After set : " + list3);

//        Collection<Integer> collection = new ArrayList<>();

        //toArray
//        Object[] arr = list3.toArray();
//        for (Object obj: arr){
//            System.out.println(obj);
//        }

        //Contains
//        System.out.println(list3.contains(100));

//        list.add(6);
//        list.add(2);
//        System.out.println("Printing entire list : " + list);
//
//        //Sort an arraylist
//        System.out.println("Sorting : ");
//        Collections.sort(list);
//        System.out.println("Printing entire list : " + list);

//        ArrayList<Integer> newList = (ArrayList<Integer>)list.clone();
//        LinkedList<Integer> newList = (LinkedList<Integer>)list.clone();
//        System.out.println("printing entire newList : " + newList);

//        ArrayList<Integer> marks = new ArrayList<>();
//        marks.ensureCapacity(100);

//        System.out.println(marks.isEmpty());
//        list.add(30);
//        list.add(60);
//        list.add(24);
//        System.out.println("printing original list : " + list);
//        System.out.println(list.lastIndexOf(5));

//        System.out.println(list.indexOf(20));
//        System.out.println(newList.indexOf(20));

        //add first and last
//        list.remove(7);
//        list.remove(6);
//        list.remove(5);
//        list.remove(4);
//        list.remove(3);
//        System.out.println("printing original list : " + list);
//        list.addFirst(101);

//        LinkedList<Integer> l1 = new LinkedList<>();
//        l1.add(10);
//        System.out.println(l1);
//        l1.addFirst(1);
//        System.out.println(l1);
//        l1.addLast(121);
//        System.out.println(l1);
//        System.out.println(l1.getFirst());
//        System.out.println(l1.getLast());
//        System.out.println(l1.peek());
//        System.out.println("Before : " + l1);
//        System.out.println("Polling : " + l1.poll());
//        System.out.println("After : " + l1);
//        System.out.println("Polling : " + l1.poll());
//        System.out.println(l1);
//        l1.offer(20);
//        System.out.println("Offer : " + l1);

//        l1.removeFirst();
//        System.out.println(l1);

//        l1.removeLast();
//        System.out.println(l1);

        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st);
        st.push(11);
        System.out.println(st);
        st.push(12);
        System.out.println(st);

        st.pop();
        System.out.println(st);

        System.out.println(st.peek());

        System.out.println(st.search(10));

        System.out.println(st.empty());


    }

}

package CollectionFramework;

import java.util.*;

public class part_2 {
    static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student(1,"Aditya");
        Student s2 = new Student(1,"Aditya");
        Student s3 = new Student(1,"Aditya");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);

        //LinkedList
//        Queue<Integer> g = new LinkedList<>();
//        g.offer(10);
//        g.offer(20);
//        g.offer(30);
//        System.out.println(g);
//
//        System.out.println("Removing : " + g.poll());
//
//        System.out.println(g);
//
//        System.out.println("Peeking : " + g.peek());

        //ArrayDeque
//        Deque<Integer> q = new ArrayDeque<>();
//        q.offer(10);
//        q.offerFirst(5);
//        q.offerLast(40);
//        System.out.println(q);
//
//        q.pollLast();
//        System.out.println(q);
//        q.pollFirst();
//        System.out.println(q);
//
//        System.out.println(q.peek());
//        System.out.println(q.peekFirst());
//        System.out.println(q.peekLast());

//        Deque<Integer> stack = new ArrayDeque<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(25);
//        System.out.println(stack);
//
//        stack.pop();
//        System.out.println(stack);
//        System.out.println(stack.peek());

        //PriorityQueue
//        Queue<Integer> pq = new PriorityQueue<>();
//        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        //default behaviour -> Integers -> less value -> high priority ->minHeap
        //maxheap -> integers -> high value ->high priority
        //pq -> strings -> comparator
//        pq.offer(10);
//        pq.offer(5);
//        pq.offer(20);
//        pq.offer(30);
//        System.out.println(pq);
//        System.out.println(pq.poll());
//        System.out.println(pq);
//        System.out.println(pq.poll());
//        System.out.println(pq);
//        System.out.println(pq.poll());
//        System.out.println(pq);

        //HashSet -> 0(1)
        //LinkedHashSet -> 0(n)
        //TreeSet -> BST -> 0(logn)

//        Set<Integer> st = new HashSet<>();
//        Set<Integer> st = new LinkedHashSet<>();
//        Set<Integer> st = new TreeSet<>();
//        st.add(40);
//        st.add(10);
//        st.add(10);
//        st.add(20);
//        st.add(20);
//        st.add(20);
//        st.add(30);
//        System.out.println(st);

//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//        set1.add(4);
//
//        set2.add(3);
//        set2.add(4);
//        set2.add(5);
//        set2.add(6);
//        System.out.println(set1);
//        set1.retainAll(set2);
//        System.out.println(set1);
//        System.out.println(set2);
//
//        System.out.println(set2.containsAll(set1));


    }
}

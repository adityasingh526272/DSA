package CollectionFramework;

import java.util.*;

public class part_3 {
    static void main(String[] args) {

        //HashMap
//        Map<String, String> mapping = new HashMap<>();
//
//        //insertion
//        mapping.put("in", "India");
//        mapping.put("en", "England");
////        mapping.put("en", "England2");
//        mapping.put("us", "United States");
//        System.out.println(mapping);
//
//        Map<String, String> table = new HashMap<>();
//        table.put("br", "Brazil");
//        System.out.println("Before : " + table);
//        table.putAll(mapping);
//        System.out.println("After : " + table);

//        Map<Integer, String> map = new HashMap<>();
//        map.put(1,"one");
//        map.put(2,"two");
//        for (Map.Entry<Integer,String>entry: map.entrySet()){
//            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
//        }
//
//        //deletion
//        table.remove("en");
//        System.out.println(table);
//
////        System.out.println(table.size());
////        table.clear();
////        System.out.println(table.size());
//
////        table.putIfAbsent("is", "India3");
////        System.out.println(table);
//
//        System.out.println(table.get("br"));
//
//        System.out.println(table.getOrDefault("us","None"));
//
//        System.out.println(table.containsKey("in"));
//
//        System.out.println(table.containsValue("United States"));
//        System.out.println(table);
//
//        table.replace("in","Indonesia");
//        System.out.println(table);
//
//        Set<String> keyset = table.keySet();
//        System.out.println(keyset);
//
//        Collection<String> valueSet = table.values();
//        System.out.println(valueSet);
//
//        //get all the entries from map
//        Set<Map.Entry<String,String>> entrySet = table.entrySet();
//        System.out.println("Printing entries : " + entrySet);

//        List<Integer> list = new ArrayList<>();
//        list.add(15);
//        list.add(2);
//        list.add(23);
//        list.add(32);
//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println(list);

//        List<Students> students = new ArrayList<>();
//        students.add(new Students(19,"Aadi",65));
//        students.add(new Students(20,"Love",69));
//        students.add(new Students(20,"Alice",84));
//        students.add(new Students(5,"Bob",40));
//        System.out.println(students);

//        Collections.sort(students);

//        Collections.sort(students, new WeightComparator());

//        Collections.sort(students, new Comparator<Students>() {
//            @Override
//            public int compare(Students o1, Students o2) {
//                return o1.weight - o2.weight;
//            }
//        });

//        Collections.sort(students,(o1,o2) -> o1.weight - o2.weight);

        //comparing
        //then comparing

//        System.out.println(students);


        Integer[] arr = {5,9,3,1,6};
        Arrays.sort(arr, new ReverseComparator());
        for (int a: arr){
            System.out.print(a + " ");
        }
    }
}

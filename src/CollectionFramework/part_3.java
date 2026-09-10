package CollectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class part_3 {
    static void main(String[] args) {

        //HashMap
        Map<String, String> mapping = new HashMap<>();

        //insertion
        mapping.put("in", "India");
        mapping.put("en", "England");
//        mapping.put("en", "England2");
        mapping.put("us", "United States");
        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();
        table.put("br", "Brazil");
        System.out.println("Before : " + table);
        table.putAll(mapping);
        System.out.println("After : " + table);

        //deletion
        table.remove("en");
        System.out.println(table);

//        System.out.println(table.size());
//        table.clear();
//        System.out.println(table.size());

//        table.putIfAbsent("is", "India3");
//        System.out.println(table);

        System.out.println(table.get("br"));

        System.out.println(table.getOrDefault("us","None"));

        System.out.println(table.containsKey("in"));

        System.out.println(table.containsValue("United States"));
        System.out.println(table);

        table.replace("in","Indonesia");
        System.out.println(table);

        Set<String> keyset = table.keySet();
        System.out.println(keyset);

        Collection<String> valueSet = table.values();
        System.out.println(valueSet);

        //get all the entries from map
        Set<Map.Entry<String,String>> entrySet = table.entrySet();
        System.out.println("Printing entries : " + entrySet);

    }
}

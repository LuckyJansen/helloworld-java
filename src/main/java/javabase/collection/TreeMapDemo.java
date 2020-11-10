package javabase.collection;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put("col1","user1");
        tm.put("col2","user2");
        tm.put("col3","user3");

        String key = "col3";
        System.out.println(key + ":" +tm.get(key));



    }
}

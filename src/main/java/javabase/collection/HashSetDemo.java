package javabase.collection;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>(); //有序不重复
        hs.add(1);
        hs.add(5);
        hs.add(4);
        System.out.println(hs);
        System.out.println(hs.contains(6));
    }
}

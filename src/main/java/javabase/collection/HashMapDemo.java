package javabase.collection;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hm = new HashMap(); //非线程安全的
        hm.put("k1","v1");
        hm.put("k2","v2");
        hm.put("k3","v3");
        System.out.println(hm.get("k2"));
    }
}

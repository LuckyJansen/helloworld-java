package javabase.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap();
        m1.put("zara", 8);
        m1.put("lili", 12);
        m1.put("wall", 27);
        m1.remove("wall");
        m1.put("xiaoming", 27);

        //m1.put("walle","nihao");
        System.out.println("Map Elements:" + m1);
        System.out.println("zara age is " + m1.get("zara"));
        m1.put("zara", m1.get("zara") + 10);
        System.out.println("size is " + m1.size());
        System.out.println("zara age is " + m1.get("zara"));

        //第一种遍历，普遍使用，二次取值
        System.out.println("通过Map.keySet遍历key和value：");
        for (String str : m1.keySet()) {
            System.out.println(str + ":" + m1.get(str));
        }

        //第二种，使用entrySet结合Iterator遍历
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, Integer>> it = m1.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> me = it.next();
            System.out.println(me.getKey() + ":" + me.getValue());
        }

        //第三种，使用entrySet结合foreach遍历
        System.out.println("使用entrySet结合foreach遍历");
        for (Map.Entry me : m1.entrySet()) {
            System.out.println(me.getKey() + ":" + me.getValue());
        }

        //第四种
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for(Integer i: m1.values()){
            System.out.println(i + ":" + m1.containsValue(i));
        }

    }
}

package javabase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("haha");

        //第一种，使用foreach遍历
        for (String str : list) {
            System.out.println(str);
        }


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //第二种，使用iterator遍历
        Iterator itt = list.iterator();
        while (itt.hasNext()){
            System.out.println(itt.next());
        }

        //第三种，将链表变为数组，使用for遍历数组
        String[] sa = new String[list.size()];
        list.toArray(sa);
        for (int i = 0; i < sa.length; i++) {
            System.out.println(sa[i]);
        }

    }
}
/*
List:有序可重复
    ArrayList
    LinkedList
Set:无序不重复
    HashSet
    TreeSet
add get contains
Map:键值对
    HashMap
    HashTable
put get foreach containsKey
*/

//https://www.runoob.com/java/java-collections.html
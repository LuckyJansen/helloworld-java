package javabase.collection;

import java.util.TreeSet;

import javabase.classBase.Person;


public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>(); //有序不重复，默认升序
        set.add(1);
        set.add(5);
        set.add(4);
        set.add(4);
        System.out.println(set);

        TreeSet<String> set1 = new TreeSet<String>(); //字符串类型：按照字典顺序排序
        set1.add("11");
        set1.add("12");
        set1.add("111");
        set1.add("112");
        System.out.println(set1);

        TreeSet<Person> set2 = new TreeSet<Person>();
        set2.add(new Person("zs",30,false));
        set2.add(new Person("ls",23,false));
        set2.add(new Person("ww",11,false));
    }
}

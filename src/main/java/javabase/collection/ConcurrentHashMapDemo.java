package javabase.collection;

import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {

        ConcurrentHashMap chm = new ConcurrentHashMap();
        chm.put(1,"hello");
        chm.put(2,"world");

        Enumeration ks = chm.keys();

        while (ks.hasMoreElements()){
            int k = (Integer) ks.nextElement();
            System.out.println(k+":"+chm.get(k));
        }

    }
}
//分段锁：只加载在某一段数据上
//读写锁
//读锁：共享锁 一个线程进行操作的时候不影响另外一个线程的操作
//写锁：排它锁
package javabase.classBase;

/**
 * Created by GAOJIANXIN637 on 2019-6-20.
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "你好，中文！";
        System.out.println(s1.length());
        String s2 = "CL12-1-2-11";
        String ss[] = s2.split("-");
        System.out.println(ss[3]);
    }
}

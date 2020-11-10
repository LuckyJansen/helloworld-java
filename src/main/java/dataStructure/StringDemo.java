package dataStructure;

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

        //面试题：a1和a2相等吗？有什么区别？
        String a1="abc";
        String a2=new String("abc");
        System.out.println(a1.equals(a2));
        System.out.println(a1==a2);
    }
}

package javabase.reflect;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //三种方法获取Class //.class文件 字节码文件 类的描述信息
        Class clz1 = String.class;
        String str = "hello";
        Class clz2 = str.getClass();
        Class clz3 = Class.forName("java.lang.String"); //如果.class被加载到内存，直接返回，如果没有被加载到内存中，先加载

        System.out.println(clz1 == clz2);
        System.out.println(clz1 == clz3);

        clz3.getConstructors();
        System.out.println(int.class);
        System.out.println(int.class.isPrimitive());
        System.out.println(String.class.isPrimitive());
        System.out.println(void.class.isPrimitive());
        System.out.println(int.class == Integer.TYPE);
    }
}

/*
* 需要掌握三个类：
* 1.Constructor
* 2.Field 属性的描述类
* 3.Method 方法的描述类
*
* */
//java的反射中有9种预定义类型：8中基本数据类型 void
/*
补充：
Class<?>... parameterTypes 可变参数类型
写法：变量类型... 可变参数的名称
     String ... param
*/
package javabase.designPattern;

import java.util.ArrayList;
import java.util.List;

public class DecoratorDemo { //装饰者模式
    private List list; //1.将要包装的类作为增强类的属性；

    public DecoratorDemo(List list){
        this.list = list;
    }

    public void add(String e){ //2.实现增强功能。
        System.out.println("增强功能-前");
        list.add(e);
        System.out.println("增强功能-后");
    }

    public static void main(String[] args) {
        DecoratorDemo z = new DecoratorDemo(new ArrayList());
        z.add("hello");

        System.out.println(z.list);
    }
}

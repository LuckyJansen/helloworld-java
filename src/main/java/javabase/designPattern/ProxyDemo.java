package javabase.designPattern;

import javabase.classBase.People;

/**
 * Created by GAOJIANXIN637 on 2019-6-12.
 */
class Source implements People {
    @Override
    public void eat() {

        System.out.println("I eat apple.");
    }
}

public class ProxyDemo implements People {

    private Source s = new Source();
    @Override
    public void eat() {

        System.out.println("代理增强方法-前");
        s.eat();
        System.out.println("代理增强方法-后");
    }

    public static void main(String[] args) {
        People p = new ProxyDemo();
        p.eat();
    }
}


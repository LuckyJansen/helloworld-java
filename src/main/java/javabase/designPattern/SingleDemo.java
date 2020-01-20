package javabase.designPattern;

public class SingleDemo {
    //1.私有的静态属性//该属性就是该类的对象
    private static SingleDemo single;

    //2.私有的构造器
    private SingleDemo(){};

    //3.公有的创建实例对象的方法
    public synchronized SingleDemo getInstance(){
        if(single == null){
            single = new SingleDemo(); //懒汉式的
        }

        return single;
    }
}

class SingleDemo01 {
    //1.私有的静态属性//该属性就是该类的对象
    private static SingleDemo01 single;

    //2.私有的构造器
    private SingleDemo01(){};

    //3.公有的创建实例对象的方法
    public SingleDemo01 getInstance(){
        if(single == null) {
            synchronized (SingleDemo01.class) {
                if (single == null) {
                    single = new SingleDemo01(); //懒汉式的
                }
            }
        }


        return single;
    }
}


class SingleDemo02{

    private static SingleDemo02 single = new SingleDemo02(); //饿汉式的
    private SingleDemo02(){};
    public SingleDemo02 getInstance(){
        return single;
    }

}
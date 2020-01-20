package javabase.serializable;

import javabase.classBase.Employee;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {

    /**
     * 请注意，一个类的对象要想序列化成功，必须满足两个条件：
     * 该类必须实现 java.io.Serializable 对象。
     * 该类的所有属性必须是可序列化的。如果有一个属性不是可序列化的，则该属性必须注明是短暂的。
     * 如果你想知道一个 Java 标准类是否是可序列化的，请查看该类的文档。检验一个类的实例是否能序列化十分简单， 只需要查看该类有没有实现 java.io.Serializable接口。
     * */

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "lilei";
        e.address = "beijing";
        e.SSN = 322322;
        e.number = 1402121990;
        e.mailCheck();
        e.showEmployee();

        try {
            FileOutputStream fileOut = new FileOutputStream("D:\\Users\\GAOJIANXIN637\\IdeaProjects\\helloworld\\employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data in D:\\Users\\GAOJIANXIN637\\IdeaProjects\\helloworld\\employee.ser");

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

}


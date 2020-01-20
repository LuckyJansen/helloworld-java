package javabase.serializable;

import javabase.classBase.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializableDemo {
    public static void main(String[] args) {
        Employee e = null;
        try{
            FileInputStream filein = new FileInputStream("D:\\Users\\GAOJIANXIN637\\IdeaProjects\\helloworld\\employee.ser");
            ObjectInputStream in = new ObjectInputStream(filein);
            e = (Employee) in.readObject();
            in.close();
            filein.close();

        }catch (IOException e1){
            e1.printStackTrace();
            return;
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
            return;
        }

        e.showEmployee();


    }
}

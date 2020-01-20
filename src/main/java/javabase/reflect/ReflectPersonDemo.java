package javabase.reflect;

import javabase.classBase.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectPersonDemo  {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c = Person.class;

        //反射获取构造器
        Constructor constructor = c.getConstructor(int.class);
        Person p = (Person) constructor.newInstance(2);
        System.out.println(p.getAge());

        //反射获取属性(只能获取公开属性)
        Field[] fields = c.getDeclaredFields();
        for(Field f: fields){
            f.setAccessible(true);
            System.out.println(f.getName());
            Class type = f.getType();
            if(type == int.class){
                f.set(p,8);
            }else if(type == String.class){
                f.set(p,"china");
            }
        }
        System.out.println(p);

        // 反射获取方法


    }


}

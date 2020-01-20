package javabase.classBase;

/**
 * Created by GAOJIANXIN637 on 2019-6-18.
 */
public class Student extends Person {

    public Student(String name){this.setName(name);}
    public static void main(String[] args) {
        Student s1 = new Student("lilei");
        System.out.println(s1.toString());
    }
}

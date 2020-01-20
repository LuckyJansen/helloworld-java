package javabase.classBase;

public class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void mailCheck(){
        System.out.println("Mailing a check to "+name+" "+address);
    }

    public void showEmployee(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("SSN: " + SSN);
        System.out.println("Number: " + number);
    }
}

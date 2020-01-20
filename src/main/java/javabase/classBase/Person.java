package javabase.classBase;

//如果把这个类放在collection包外，如何能被该包中类使用？
public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private boolean gender;
    public String department;
    public String nation;


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }



    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(Person o) {
         int tmp = this.age-o.age;
         if(tmp>=0){tmp=1; }
        return tmp;
    }

    @Override
    public String toString(){
        return this.name+","+this.age+","+this.department;
    }
}

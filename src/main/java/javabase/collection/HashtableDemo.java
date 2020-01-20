package javabase.collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashtableDemo {
    public static void main(String[] args) {

        //它和HashMap类很相似，但是它支持同步。//线程安全的 //同步功能是什么样子的? 同步就是线程之间的交互
        Hashtable balance = new Hashtable();
        Enumeration names ;
        String str;
        double bal;

        balance.put("helo",new Double(3434.12));
        balance.put("malo",new Double(2332.11));
        balance.put("Ayan", new Double(1378.00));
        balance.put("Daisy", new Double(99.22));
        balance.put("Qadir", new Double(-19.08));

        //show all balance in hashtable
        names = balance.keys();
        while(names.hasMoreElements()){
            str = (String) names.nextElement();
            System.out.println(str + ":" + balance.get(str));
        }

        //Deposit 1000 into helo accout

        balance.put("helo",(Double)balance.get("helo")+1000);
        System.out.println("Zara's new balance: " + balance.get("helo"));

        Set set = balance.keySet();
    }
}

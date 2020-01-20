package javabase.collection;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties pt = new Properties();
        Set state;
        String str;

        pt.put("h1","n1");
        pt.put("h2","n2");
        pt.put("h3","n3");
        pt.put("h4","n4");
        pt.put("h5","n5");
        pt.put("h6",5);

        state = pt.keySet();

        Iterator itr = state.iterator();
        while (itr.hasNext()){
            str = (String) itr.next();
            System.out.println(str+ ":" + pt.getProperty(str));
        }

        System.out.println("flolr"+ ":" + pt.getProperty("flolr","Not Found."));

    }
}

package javabase.classBase;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by GAOJIANXIN637 on 2019-6-18.
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(date);
        System.out.println(modifiedDate);
        System.out.println(date);
    }
}

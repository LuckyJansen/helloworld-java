package javabase.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.baidu.com");
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection connection = null;
            System.out.println("URL instanceof Object:"+(url instanceof Object));
            if(urlConnection instanceof HttpURLConnection){ // object instanceof class
                connection = (HttpURLConnection) urlConnection;
            }else {
                System.out.println("请输入URL地址");
                return;
            }


            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String urlString = "";
            String current;
            while ((current = in.readLine())!= null){
                urlString += current;
            }
            System.out.println(urlString);
            connection.disconnect();
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

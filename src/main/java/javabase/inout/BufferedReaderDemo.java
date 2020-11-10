package javabase.inout;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/in.txt"));
        String line = null;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
    }
}

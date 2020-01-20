package javabase.net;

import java.net.*;
import java.io.*;

public class SocketServerDemo extends Thread {
    private ServerSocket serverSocket;

    public SocketServerDemo(int port) throws IOException {

        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("等待远程连接，端口号为：" + serverSocket.getLocalPort() + "...");
            try {
                Socket server = serverSocket.accept(); //在服务器端，accept() 方法返回服务器上一个新的 socket 引用，该 socket 连接到客户端的 socket。
                System.out.println("远程主机地址：" + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("谢谢连接我：" + server.getLocalSocketAddress() + "\nGoodbye!");
                server.close();
            } catch (SocketTimeoutException s) {
                System.out.println("Socket timed out!");
                break;
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {
        int port = Integer.parseInt(args[0]);
        try {
            Thread t = new SocketServerDemo(port);
            t.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

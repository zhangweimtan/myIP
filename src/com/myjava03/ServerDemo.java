package com.myjava03;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
    Tcp接受数据
        分析：
            创建socket对象，明确端口号；
            监听，accept
            获取输入流对象
            接受数据，输入流
            输出数据
            释放资源
        ServerSocket:
            ServerSocket(int port)
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
//        创建socket对象
        ServerSocket ss = new ServerSocket(10086);
//        监听
        Socket s = ss.accept();
//        获取输入流对象
        InputStream is = s.getInputStream();
//        InetAddress address = new InetAddress();
//        获取数据
        byte[] bys = new byte[1024];
        int len;
        len = is.read(bys);
//        输出数据
        System.out.println("client:"+InetAddress.getLocalHost());
        System.out.println(new String(bys, 0, len));
//        释放资源
        s.close();
//        ss.close();



    }
}

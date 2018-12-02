package com.myjava03;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
    TCP协议：
        创建Socket对象（创建目标设备的IP，port）
        获取输出流对象
        发送数据--IO流
        释放资源
    Socket(InetAddress address, int port)

 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
//        创建发送端对象
        Socket s = new Socket(InetAddress.getLocalHost(), 10086);
//        获取输出流对象
        OutputStream os = s.getOutputStream();
//        发送数据
        String str = "hello tcp, am coming!";
        os.write(str.getBytes());
//        释放资源
        s.close();
    }
}

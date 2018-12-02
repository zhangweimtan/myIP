package com.myjava02;

import java.io.IOException;
import java.net.*;

/*
    UDP协议
        创建发送端Socket对象
        创建数据，并打包

        发数据
        释放资源

    DatagramSocket:此类表示用来发送和接受数据，基于udp协议
    DatagramSocket():创建Socket对象，并随机分配端口号
    DatagramSocket(int port):创建Socket对象，并制定端口
 */
public class UDPDemo {
    public static void main(String[] args) throws IOException {
//        创建Socket对象，无参构造
        DatagramSocket ds = new DatagramSocket();
//        打包数据
        String s = "hello udp, am coming!";
        byte[] bys = s.getBytes();
        int len = bys.length;
        InetAddress address = InetAddress.getByName("zhangdeMacBook-Air.local");
        int port = 8888;
        DatagramPacket dp = new DatagramPacket(bys, len, address, port);

                /*
                    数据：字节，字节数组byte[]
                    设备地址：IP
                    进程地址：端口
                    DatagramPacket(byte[], int length, InetAddress address, int port)

                 */


//        发送
        ds.send(dp);
//        释放资源
        ds.close();
    }
}

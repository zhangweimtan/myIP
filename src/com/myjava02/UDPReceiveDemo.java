package com.myjava02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
    使用udp协议接受数据
        创建接收端socket对象
        接受数据
        解析数据

 */
public class UDPReceiveDemo {
    public static void main(String[] args) throws IOException {
//        创建Socket对象，接收端指定端口
        DatagramSocket ds = new DatagramSocket(8888);
//        接受数据
        byte[] bys = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bys, bys.length);
        ds.receive(dp);
//        解析数据
        InetAddress address = dp.getAddress();
//        byte[] getData(): 获取接受到的数据，也可以使用创建接受创建包时的数组bys
        byte[] data = dp.getData();
//        接受数据的长度
        int len = dp.getLength();

//        输出数据
        System.out.println("send:"+address.getHostAddress());
        System.out.println(new String(data,0,len));
        System.out.println(new String(bys,0,len));
//        释放资源
        ds.close();


    }
}

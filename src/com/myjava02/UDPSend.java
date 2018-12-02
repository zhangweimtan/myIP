package com.myjava02;

import java.io.IOException;
import java.net.*;

/*
    UDP协议收发数据的注意事项：

 */
public class UDPSend {
    public static void main(String[] args) throws IOException {
//        创建发送端对象
        DatagramSocket ds = new DatagramSocket();
//        创建包对象
        byte[] bys = "hello udp, am coming again!".getBytes();
        int port = 9999;
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getLocalHost(), port);
//        发送数组
        ds.send(dp);
//        释放资源
        ds.close();

    }
}

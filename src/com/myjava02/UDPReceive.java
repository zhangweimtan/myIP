package com.myjava02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
    注意事项：
        端口号错误，不会出现异常
        端口号占用，端口被绑定
 */
public class UDPReceive {
    public static void main(String[] args) throws IOException {
//       创建接收端socket对象,指定端口号
        DatagramSocket ds = new DatagramSocket(9999);
//        接受数据
        byte[] bys = new byte[1024];//创建接受容器
        DatagramPacket dp = new DatagramPacket(bys, bys.length);//创建接受包
        ds.receive(dp);//调用DatagramSocket receive方法
//        获取发送端IP
        InetAddress address = dp.getAddress();
//        解析数据
        byte[] data = dp.getData();
//        获取数据长度,截取有效数据
        int len = dp.getLength();
//        输出数据
        System.out.println("send:"+ address);
        System.out.println(new String(data, 0, len));
//        释放资源
        ds.close();
    }
}

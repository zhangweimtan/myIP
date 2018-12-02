package com.myjava04;
/*
    需求：使用tcp协议发送数据，并将接收到的数据转换成大写返回
    客户端发出数据
    服务端接受数据
    服务端转换数据
    服务端发送数据
    客户端接受数据

 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
//        创建客户端socket
        Socket s = new Socket(InetAddress.getLocalHost(), 10088);
//        获取输出流对象
        OutputStream os = s.getOutputStream();
//        发出数据
        os.write("tcp, am coming again!".getBytes());
//        创建输入流
        InputStream is = s.getInputStream();
//        接受数据
        byte[] bys = new byte[1024];
        int len;
        len = is.read(bys);//
//        输出数据
        System.out.println(new String(bys, 0,len));

//        释放资源
        s.close();

    }
}

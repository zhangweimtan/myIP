package com.myjava04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*

 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
//        创建服务端socket
        ServerSocket ss = new ServerSocket(10088);
//        监听，返回socket对象
        Socket s = ss.accept();
//        创建输入流对象

        InputStream is = s.getInputStream();
//        获取数据
        byte[] bys = new byte[1024];
        int len;
        len = is.read(bys);
        String str = new String(bys, 0, len);
        System.out.println(str);
//        转换数据
        String upperStr = str.toUpperCase();
//        获取输出流对象
        OutputStream os = s.getOutputStream();
//        返回数据-发送出去
        os.write(upperStr.getBytes());
//        释放资源
        s.close();



    }
}

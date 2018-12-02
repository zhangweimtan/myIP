package com.myjava05;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        //        创建服务端ServerSocket
        //        考虑使用进程，多线程
        ServerSocket ss = new ServerSocket(10010);
//       监听返回socket对象
        Socket s = ss.accept();

        while(true) {
            boolean flag = method(s);
            if(flag){
                break;
            }

        }
        s.close();
    }

    private static boolean method(Socket s) throws IOException, InterruptedException {
        Thread.sleep(100);
//        获取输入流对象
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String username = br.readLine();
        String psd = br.readLine();
//        判断用户名和密码
        boolean flag = false;
        if (username.equals("name")  && psd.equals("123456")){
            flag = true;
        }
//        获取输出流
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        if (flag){
            out.println("登陆成功");
            System.out.println("用户登陆成功");
        } else {
            out.println("登陆失败");
        }
       return flag;
    }
}

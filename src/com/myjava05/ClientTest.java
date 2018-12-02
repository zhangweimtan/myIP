package com.myjava05;

import java.io.*;
import java.net.Socket;

/*
    模拟用户登陆
    步骤：
        创建客户端socket对象
        获取输出流对象，
        键盘录入账号，密码
        写出数据

        获取输入流对象，
        获取服务器返回的数据

        释放资源


 */
public class ClientTest {
    public static void main(String[] args) throws IOException {
        //        创建客户端socket对象,host

        Socket s = new Socket("localhost", 10010);
        while (true){
            String res = method(s);
            if(res.equals("登陆成功")){
                System.out.println(res);
                break;
            }
        }
        s.close();
    }

    private static String method(Socket s) throws IOException {

//        获取输出流对象，高效输出流，字符数组
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入用户名：");
        String username = br.readLine();
        System.out.println("请输入密码：");
        String psd = br.readLine();
//        发送数据
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
//        写出数据,两行
        out.println(username);
        out.println(psd);
//        获取输入流对象,buffer额度包装
        BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String res = br2.readLine();

        return res;

    }
}

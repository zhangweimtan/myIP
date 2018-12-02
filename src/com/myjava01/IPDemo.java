package com.myjava01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("zhangdeMacBook-Air.local");
//        InetAddress address = InetAddress.getByName("192.168.50.231");
//        InetAddress address2 = InetAddress.getLocalHost();
//        System.out.println(address2);
//        System.out.println(address);
        String hostAddress = address.getHostAddress();
        String hostName = address.getHostName();
        System.out.println(hostAddress);
        System.out.println(hostName);
    }
}

package com.myjava05;

import java.util.ArrayList;
import java.util.List;

public class UserDb {
    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User("jack", "123"));
        users.add(new User("rose", "345"));
        users.add(new User("tom", "456"));
        users.add(new User("tony", "789"));
    }
    public static  List<User> getUsers(){
        return users;
    }
}

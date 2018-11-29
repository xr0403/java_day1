package com.baizhi.test;

import com.baizhi.dao.UserDaoImpl;

public class test {
    public static void main(String[] args) {
        UserDaoImpl user=new UserDaoImpl();
        String name=user.find("xxx");
        System.out.println(name);
    }  VB ‘
}

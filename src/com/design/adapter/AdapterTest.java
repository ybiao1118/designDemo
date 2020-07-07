package com.design.adapter;

import org.junit.Test;

public class AdapterTest {
    @Test
    public void test(){
        //IUserInfo userInfo=new User();
        //找外边的人
        IUserInfo userInfo=new UserAdapter();
        userInfo.getHomeAddress();
        userInfo.getHomeTelNumber();
        userInfo.getJobPosition();
        userInfo.getMobileNumber();
        userInfo.getUserName();
        userInfo.getOfficeTelNumber();
        System.out.println("--------------------------");

    }
    @Test
    public  void test1(){
        IUserInfo userInfo=new UserAdapter1();
        userInfo.getHomeAddress();
        userInfo.getHomeTelNumber();
        userInfo.getJobPosition();
        userInfo.getMobileNumber();
        userInfo.getUserName();
        userInfo.getOfficeTelNumber();
        System.out.println("--------------------------");

    }
}

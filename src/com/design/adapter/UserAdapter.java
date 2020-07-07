package com.design.adapter;

import java.util.Map;
//类适配器模式
public class UserAdapter extends OuterUser implements  IUserInfo {

    private Map userBaseInfo= (Map) super.getUserBaseInfo();
    private Map userHomeInfo=(Map)super.getUserHomeInfo();
    private Map userOfficeInfo=(Map)super.getUserOfficeInfo();
    @Override
    public String getUserName() {
        String userName= (String) userBaseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress=(String) userHomeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber= (String) userBaseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String)userOfficeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;

    }

    @Override
    public String getJobPosition() {
        String jobPosition = (String)userOfficeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String)userHomeInfo.get("homeTelNumbner");
        System.out.println(homeTelNumber);
        return homeTelNumber;


    }
}

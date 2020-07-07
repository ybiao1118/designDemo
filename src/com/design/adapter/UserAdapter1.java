package com.design.adapter;
//对象适配器模式
public class UserAdapter1 implements IUserInfo {
    private OuterUser outerUser=new OuterUser();
    @Override
    public String getUserName() {
        String userName= (String) outerUser.getUserBaseInfo().get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress=(String) outerUser.getUserHomeInfo().get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber= (String) outerUser.getUserBaseInfo().get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String)outerUser.getUserOfficeInfo().get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;

    }

    @Override
    public String getJobPosition() {
        String jobPosition = (String)outerUser.getUserOfficeInfo().get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String)outerUser.getUserHomeInfo().get("homeTelNumbner");
        System.out.println(homeTelNumber);
        return homeTelNumber;


    }
}

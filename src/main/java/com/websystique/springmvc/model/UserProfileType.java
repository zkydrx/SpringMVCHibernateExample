package com.websystique.springmvc.model;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-09-08
 * Time: 00:49
 * Description:
 */
public enum UserProfileType
{
    USER("USER"),
    DBA("DBA"),
    ADMIN("ADMIN");

    String userProfileType;

    private UserProfileType(String userProfileType){
        this.userProfileType = userProfileType;
    }

    public String getUserProfileType(){
        return userProfileType;
    }
}

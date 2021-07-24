package com.example.utils;

import com.example.entity.UserInfo;

/**
 * @Author LJM
 * @Date 2021/7/23 9:21
 * @Version 1.0
 */
public class UserInfoContext {

    private static ThreadLocal<UserInfo> userInfo = new ThreadLocal<UserInfo>();

    public static String KEY_USERINFO_IN_HTTP_HEADER = "X-AUTO-FP-USERINFO";

    public UserInfoContext(){
    }

    public static UserInfo getUser(){
        return (UserInfo) userInfo.get();
    }

    public static void setUser(UserInfo user){
        UserInfo.set(user);
    }
}

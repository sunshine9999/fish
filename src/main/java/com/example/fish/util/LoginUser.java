package com.example.fish.util;

import com.example.fish.model.SysUser;

import javax.servlet.http.HttpServletRequest;

public class LoginUser {

    public static SysUser getSessionLoginUser(HttpServletRequest httpServletRequest){
        SysUser sysUser = (SysUser)httpServletRequest.getSession().getAttribute("loginUser");
        return sysUser;
    }

}

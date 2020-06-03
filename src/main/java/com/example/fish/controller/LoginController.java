package com.example.fish.controller;

import com.example.fish.api.LoginApi;
import com.example.fish.model.SysUser;
import com.example.fish.service.SysUserService;
import com.example.fish.util.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Slf4j
@RestController
public class LoginController implements LoginApi {

    @Resource
    private SysUserService sysUserService;

    @Override
    public ResultData sysLogin(String userAccount, String userPassword, HttpServletRequest httpServletRequest) {
        ResultData result = new ResultData();
        try{
            SysUser user = sysUserService.findByUserAccountAndUserPassword(userAccount,userPassword);
            if(user!=null){
                result.setCode("200");
                result.setMess("查询成功");
                result.setData(user);
                HttpSession session = httpServletRequest.getSession(true);
                session.setAttribute("loginUser", user);
            }else{
                result.setCode("201");
                result.setMess("用户名或密码错误");
            }
        }catch(Exception e){
            result.setCode("202");
            result.setMess("后台发生异常");
            e.printStackTrace();
        }
        return result;
    }

}

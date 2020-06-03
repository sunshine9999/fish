package com.example.fish.api;

import com.example.fish.util.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Api(value = "sysLogin", tags = "sysLogin")
@RequestMapping(path = "/biz-api/fish/sysLogin/v1/info")
public interface LoginApi {

    @ApiOperation(value = "登录")
    @PostMapping("/sysLogin")
    public ResultData sysLogin(@RequestParam(name = "userAccount", required = true) String userAccount,
                               @RequestParam(name = "userPassword", required = true) String userPassword,
                               HttpServletRequest httpServletRequest);

}

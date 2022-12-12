package com.airuoro.incloud.demo.controller;

import com.airuoro.incloud.demo.model.UserModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "用户接口")
@RequestMapping("/v1")
public class UserController {

    @ApiOperation(value = "查询用户", notes = "查询用户")
    @ApiResponses({
            @ApiResponse(code = 1, message = "查询失败")
    })
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public UserModel getUser() {
        UserModel userModel = new UserModel();
        userModel.setId(1);
        userModel.setAccount("incloud");
        userModel.setName("ggy");
        userModel.setPassword("123123");
        return userModel;
    }


}

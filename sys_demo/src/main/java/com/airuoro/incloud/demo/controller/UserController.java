package com.airuoro.incloud.demo.controller;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@Api(value = "用户接口")
@RequestMapping("/v1")
public class UserController {

    @Autowired
    private EurekaClient client;

    @ApiOperation(value = "查询用户", notes = "查询用户")
    @ApiResponses({
            @ApiResponse(code = 1, message = "查询失败")
    })
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public Set getUser() {
        Set<String> allKnownRegions = client.getAllKnownRegions();
        return allKnownRegions;
    }


}

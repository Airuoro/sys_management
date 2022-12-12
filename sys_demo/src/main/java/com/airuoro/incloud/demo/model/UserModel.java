package com.airuoro.incloud.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "用户信息")
public class UserModel {

    @ApiModelProperty(name = "用户id", required = true)
    private Integer id;

    @ApiModelProperty(name = "用户名", required = true)
    private String name;

    @ApiModelProperty(name = "账户", required = true)
    private String account;

    @ApiModelProperty(name = "密码", required = true)
    private String password;

}

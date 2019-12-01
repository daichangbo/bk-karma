package com.bk.karma.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author daichangbo
 * @date 2019-11-23 14:17
 */
@Data
@ApiModel
public class UserDTO {

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("密码")
    private String passWord;
}

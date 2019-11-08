package com.bk.karma.controller;

import com.bk.karam.result.ResultBase;
import com.bk.karam.result.ResultBuilder;
import com.bk.karma.dto.UserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daichangbo
 * @date 2019-11-08 15:06
 */
@Api(value = "用户|UserController")
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation(value = "用户获取", tags = {"返回用户信息"}, notes = "务必提交json格式")
    @RequestMapping("/fetch")
    public ResultBase<UserDTO> fetchUser ( @RequestBody UserDTO userDTO ) {
        userDTO.setAge ( 27 );
        userDTO.setUserName ( "frank" );
        return ResultBuilder.builder ( true,userDTO );
    }
}

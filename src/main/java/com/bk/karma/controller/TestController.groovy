package com.bk.karma.controller

import com.alibaba.fastjson.JSON
import com.bk.karma.dto.UserDTO

import java.util.stream.Collectors

/**
 * @author daichangbo* @date 2019-10-24 20:52
 */
class TestController {

    def author = 'chenlong'
    def getAuthorName(){
        //return author  思考一下为什么这里不能访问到author变量
        return 'chenlong'
    }
    def sayHello(){
        println 'Hello '+getAuthorName()
    }




}

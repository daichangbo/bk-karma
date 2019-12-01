package com.bk.karma.controller;

import com.alibaba.fastjson.JSON;
import com.bk.karma.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author daichangbo
 * @date 2019-11-29 16:40
 */
public class TestCont {

    public static void main(String[] args) {
        List<UserDTO> userDTOLisy = new ArrayList<> ();
        UserDTO userDTO = new UserDTO();
        userDTO.setUserName("快捷流程");

        UserDTO userDTO1 = new UserDTO();
        userDTO1.setUserName("app");
        UserDTO userDTO2 = new UserDTO();
        userDTO2.setUserName("3223");
        UserDTO userDTO3 = new UserDTO();
        userDTO3.setUserName("111");
        userDTOLisy.add(userDTO);
        userDTOLisy.add(userDTO1);
        userDTOLisy.add(userDTO2);
        userDTOLisy.add(userDTO3);
        System.out.println (JSON.toJSONString(userDTOLisy));
       List<UserDTO>  u = userDTOLisy.stream() .filter(p -> !p.getUserName ().startsWith("app"))
                .filter (m -> !m.getUserName ().contains ( "快捷流程" )  )
                .collect( Collectors.toList());

        System.out.println (JSON.toJSONString(u));
    }
}

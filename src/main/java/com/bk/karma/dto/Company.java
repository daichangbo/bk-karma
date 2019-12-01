package com.bk.karma.dto;

import lombok.Data;

import java.util.List;

/**
 * @author daichangbo
 * @date 2019-12-01 16:39
 */
@Data
public class Company {

    private String name ;

    private List<Employee> employeeList;
}

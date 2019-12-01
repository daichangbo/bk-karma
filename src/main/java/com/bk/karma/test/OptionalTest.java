package com.bk.karma.test;

import com.alibaba.fastjson.JSON;
import com.bk.karma.dto.Company;
import com.bk.karma.dto.Employee;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author daichangbo
 * @date 2019-12-01 16:08
 *
 * Optional 用于解决NPE (NullPointerException)
 */
public class OptionalTest {

    public static void main ( String[] args ) {
        Optional<String> optional = Optional.of ( "hello" );
//        if (optional.isPresent ( )) {
//            System.out.println (optional.get ());
//        }
        optional.ifPresent ( item -> System.out.println (item) ); //推荐的Optional使用方式
        System.out.println (optional.orElse ( "world" ));

        System.out.println (optional.orElseGet ( () -> "nihao" ));

        Employee employee = new Employee ();
        employee.setName ( "zhangsan" );

        Employee employee1 = new Employee ();
        employee1.setName ( "zhangsan" );

        Company company = new Company () ;
//        company.setName ( "company1" );

        List<Employee> employeeList = Arrays.asList ( employee,employee1 );
//        company.setEmployeeList ( employeeList );
        Optional<Company> optional1 = Optional.ofNullable ( company );


        List<Employee> list = optional1.map ( theCompany -> theCompany.getEmployeeList () ).orElse ( Collections.emptyList () );
        System.out.println ( JSON.toJSONString (list) );
    }
}

package com.bk.karma.test;

import com.bk.karma.dto.Student;

import java.util.function.Supplier;

/**
 * @author daichangbo
 * @date 2019-12-01 15:26
 */
public class StudentTest {

    public static void main ( String[] args ) {
        Supplier<Student> supplier = () -> new Student();
        System.out.println (supplier.get ().getName ());
        System.out.println ("---------------");

        //构造方法引用
        Supplier<Student> supplier1 = Student::new ;
        System.out.println (supplier1.get ().getName ());
    }
}

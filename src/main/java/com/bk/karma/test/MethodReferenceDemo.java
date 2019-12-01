package com.bk.karma.test;

import com.alibaba.fastjson.JSON;
import com.bk.karma.dto.Student;

import java.util.Arrays;
import java.util.List;

/**
 * @author daichangbo
 * @date 2019-12-01 20:02
 */
public class MethodReferenceDemo {

    public static void main ( String[] args ) {
//        List<String> list = Arrays.asList ( "hello","world","hello world" );
//        list.forEach ( System.out :: println );

        Student student = new Student ( "zhangsan" ,10);
        Student student1 = new Student ( "lisi" ,90);
        Student student2 = new Student ( "wangwu" ,50);
        Student student3 = new Student ( "zhouliu" ,40);
        List<Student> students = Arrays.asList ( student,student1,student2,student3 ) ;
        students.sort ( (stu ,stu2 ) -> Student.compareStudentByScore(stu,stu2));
        System.out.println ( JSON.toJSONString (students));

        System.out.println ("---------");

        students.sort ( Student :: compareStudentByScore );

        students.forEach ( stud -> System.out.println (stud.getScore ()) );


        System.out.println ("-----------");
        StudentComparator studentComparator = new StudentComparator();

        students.sort ( Student :: compareStudentByScore );

        students.forEach ( stud1 -> System.out.println (stud1.getScore ()) );
    }
}

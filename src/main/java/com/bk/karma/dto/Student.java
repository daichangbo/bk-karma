package com.bk.karma.dto;

import lombok.Data;

/**
 * @author daichangbo
 * @date 2019-12-01 15:25
 */
@Data
public class Student {

    private String name ;

    private int age ;

    private int score;

    public Student () {

    }

    public Student (String name,int score) {
     this.score = score;
     this.name = name;
    }

    public static int compareStudentByScore (Student student ,Student student1) {
        return student.getScore () - student1.getScore ();
    }

    public static int compareStudentByName (Student student ,Student student1) {
        return student.getName ().compareTo ( student1.getName () );
    }

}

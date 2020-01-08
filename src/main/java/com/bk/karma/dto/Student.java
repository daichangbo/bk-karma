package com.bk.karma.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author daichangbo
 * @date 2019-12-01 15:25
 */
@Data
public class Student {

    private String name ;

    private int age ;

    private int score;

    private Double price ;

    private BigDecimal amount;

    @JsonFormat(timezone = "GMT+8", pattern = "yyy-MM-dd 00:00:00")
    private Date startDate ;

    @JsonFormat(timezone = "GMT+8", pattern = "yyy-MM-dd 23:59:59")
    private Date endDate;

    public Student () {

    }

    public Student (String name,int score) {
     this.score = score;
     this.name = name;
    }

    public Student (String name,int score,Double price) {
        this.score = score;
        this.name = name;
        this.price = price;
    }

    public Student (String name,int score,Double price,BigDecimal amount) {
        this.score = score;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }


    public static int compareStudentByScore (Student student ,Student student1) {
        return student.getScore () - student1.getScore ();
    }

    public static int compareStudentByName (Student student ,Student student1) {
        return student.getName ().compareTo ( student1.getName () );
    }

    public int compareByScore (Student student) {
        return this.getScore () - student.getScore ();
    }

    public int compareByname (Student student) {
        return this.getName ().compareToIgnoreCase ( student.getName () );
    }

}

package com.bk.karma.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * @author daichangbo
 * @date 2019-10-21 14:19
 */
public class Test {

    public String aBlockOfCode ;

    public void doSomeShit (String s) {
        System.out.println(s);
    }
    // Redis Module BloomFilter RedisSearch Redis-ML
    // setnx

    public static void main(String[] args) {
//        System.out.println(getCurrentYear());
//        String nowYear = getCurrentYear();
//        String oldYear = "2010" ;
//        Integer year = Integer.valueOf(nowYear) - Integer.valueOf(oldYear) ;
//        System.out.println(year+"年");

        if (Objects.equals(2, CourseStandardTypeEnum.MONTH_CLASS.getCode())) {
            System.out.println("2");
        } else {
            System.out.println("1");
        }

    }

    public static String getCurrentYear() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date date = new Date();
        return sdf.format(date);
    }
}

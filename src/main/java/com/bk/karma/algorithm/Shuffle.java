package com.bk.karma.algorithm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Auther dcb
 * @Date 2020/8/17
 * 重新排列数组
 */
public class Shuffle {
    public static void main(String[] args) {
        String endTimes = "2018-08-14 00:10:00";
        String nextStartTimes = "2018-08-15 00:30:00";
        Date endtTime = strToDate(endTimes) ;
        Date nextStartTime = strToDate(nextStartTimes) ;
        Calendar cal = Calendar.getInstance();
        cal.setTime(endtTime);
        cal.add(Calendar.MINUTE, 30);
        Date d2 = cal.getTime();
        System.out.println(compare(nextStartTime,d2)+"");
    }

    public static int compare(Date date1, Date date2) {
        try {
            if (date1.getTime() > date2.getTime()) {
                return 1;
            } else if (date1.getTime() < date2.getTime()) {
                return -1;
            } else {
                return 0;
            }
        } catch (Exception exception) {
        }
        return 0;
    }
    public static Date strToDate(String dateString) {
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString);
        } catch (ParseException e) {
        }
        return date;
    }
}

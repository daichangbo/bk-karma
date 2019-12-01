package com.bk.karma.test;

import com.bk.karma.dto.Student;

/**
 * @author daichangbo
 * @date 2019-12-01 20:36
 */
public class StudentComparator {

    public int compareStudentByScore ( Student student , Student student1) {
        return student.getScore () - student1.getScore ();
    }

    public int compareStudentByName (Student student ,Student student1) {
        return student.getName ().compareTo ( student1.getName () );
    }
}

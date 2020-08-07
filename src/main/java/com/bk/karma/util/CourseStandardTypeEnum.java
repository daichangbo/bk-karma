package com.bk.karma.util;

import lombok.Getter;

import java.util.Objects;

@Getter
public enum CourseStandardTypeEnum {

    STANDARD_COURSE (1,"标准课"),
    MONTH_CLASS(2,"月课");

    private int code;

    private String desc;

    CourseStandardTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String getDesc(Integer code){
        for(CourseStandardTypeEnum cs : CourseStandardTypeEnum.values()){
            if(Objects.equals(code, cs.getCode())){
                return cs.getDesc();
            }
        }
        return STANDARD_COURSE.getDesc();
    }

    public static Integer getCode(String desc){
        for(CourseStandardTypeEnum cs : CourseStandardTypeEnum.values()){
            if(Objects.equals(desc, cs.getDesc())){
                return cs.getCode();
            }
        }
        return null;
    }
}

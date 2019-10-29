package com.bk.karma.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * @author daichangbo
 * @date 2019-10-29 16:30
 */
@Data
public class Son implements Serializable ,Cloneable {
    private static final long serialVersionUID = -8161639990324544601L;

    private String name;

    private Son son;

    public Son () {
        super();
    }

    @Override
    public String toString() {
        return super.toString ();
    }

    @Override
    public Object clone () throws CloneNotSupportedException {
        return super.clone ();
    }

}

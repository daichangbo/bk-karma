package com.bk.karma.exception;

/**
 * @author daichangbo
 * @date 2019-10-15 23:43
 */
public class ServiceException extends Exception {

    private String message ;

    private int code ;

    public ServiceException () {
        super();
    }

    public ServiceException (String message , int code) {
        super();
    }

    public ServiceException (int code) {
        super();
    }
}

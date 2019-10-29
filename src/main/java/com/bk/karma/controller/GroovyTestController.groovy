package com.bk.karma.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.invoke.MethodHandles

/**
 * @author daichangbo* @date 2019-10-25 11:06
 */
@RestController
public class GroovyController implements GroovyObject {


    @RequestMapping("/hello")
    public String hello () throws Exception {
        final MethodHandles.Lookup lookup = MethodHandles.lookup();

        return  "Hello Spring boot.";
    }

    @Override
    public Object invokeMethod ( String s, Object o ) {
        return null;
    }

    @Override
    public Object getProperty ( String s ) {
        return null;
    }

    @Override
    public void setProperty ( String s, Object o ) {

    }

    @Override
    public MetaClass getMetaClass () {
        return null;
    }

    @Override
    public void setMetaClass ( MetaClass metaClass ) {

    }

    public static void main(String[] args) {
        printf "dwdw"
    }
}

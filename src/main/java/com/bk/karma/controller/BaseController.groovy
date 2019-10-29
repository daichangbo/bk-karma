package com.bk.karma.controller

import groovy.lang.Closure;
import groovy.lang.MetaClass;
import groovy.lang.Reference
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.ref.SoftReference;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.codehaus.groovy.reflection.ClassInfo;
import org.codehaus.groovy.runtime.GStringImpl;
import org.codehaus.groovy.runtime.GeneratedClosure;
import org.codehaus.groovy.runtime.ScriptBytecodeAdapter;
import org.codehaus.groovy.runtime.callsite.CallSite;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.codehaus.groovy.runtime.typehandling.DefaultTypeTransformation;
import org.codehaus.groovy.runtime.typehandling.ShortTypeHandling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
/**
 * @author daichangbo* @date 2019-10-24 20:07
 */
class BaseController implements GroovyObject {


    public BaseController() {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        MetaClass metaClass1 = $getStaticMetaClass();
        this.metaClass = metaClass1;
        metaClass1;
    }

    public Object testGetContext(HttpServletRequest request, @RequestBody Map map) {
        CallSite[] arrayOfCallSite = $getCallSiteArray();
        arrayOfCallSite[0].call(org.springframework.web.servlet.support.RequestContextUtils.class, request);
        return arrayOfCallSite[1].call(request, arrayOfCallSite[2].callGetProperty(org.springframework.web.servlet.DispatcherServlet.class));
    }


    Object object2;

}

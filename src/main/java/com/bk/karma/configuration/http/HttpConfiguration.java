package com.bk.karma.configuration.http;

import com.jk.base.http.HttpFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author daichangbo
 */
@Component
public class HttpConfiguration {

    @Bean(value = "httpClient" ,initMethod = "init")
    public HttpFactoryBean initHttpFactoryBean() {
        HttpFactoryBean httpFactoryBean = new HttpFactoryBean ();
        httpFactoryBean.setConnectTime(5000);
        return httpFactoryBean;
    }
}

package com.bk.karma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class BkKarmaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BkKarmaApplication.class, args);
    }

}

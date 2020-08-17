package com.bk.karma;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
@MapperScan("com.bk.karma.mybatis.mapper")
public class BkKarmaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BkKarmaApplication.class, args);
    }

}

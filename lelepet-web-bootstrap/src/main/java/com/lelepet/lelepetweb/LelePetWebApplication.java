package com.lelepet.lelepetweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = {"com.lelepet.lelepetweb.service.core.mapper", "com.lelepet.lelepetweb.service.core.readmapper"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class})
@ComponentScan(value = {"com.lelepet.lelepetweb.service"})
public class LelePetWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(LelePetWebApplication.class, args);

    }

}

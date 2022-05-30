package com.crm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan( value = {"com.crm.dao","com.crm.entity"})
@SpringBootApplication
public class DemoToolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoToolsApplication.class, args);
    }

}

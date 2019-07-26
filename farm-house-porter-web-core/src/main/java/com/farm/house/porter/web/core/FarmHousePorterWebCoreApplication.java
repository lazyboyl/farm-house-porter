package com.farm.house.porter.web.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.farm.house.porter.web.core.dao")
public class FarmHousePorterWebCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(FarmHousePorterWebCoreApplication.class, args);
    }

}

package com.farm.house.porter.web.core;

import com.farm.house.porter.web.core.util.RedisCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.farm.house.porter.web.core.dao")
public class FarmHousePorterWebCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(FarmHousePorterWebCoreApplication.class, args);
    }

    @Bean
    RedisCache redisCache(){
        return new RedisCache();
    }

}

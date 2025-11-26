package com.yupi.yuaicodemother;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yupi.yuaicodemother.mapper")
public class CuiAiCodeMotherApplication {

    public static void main(String[] args) {
        SpringApplication.run(CuiAiCodeMotherApplication.class, args);
    }

}

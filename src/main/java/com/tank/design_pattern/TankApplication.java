package com.tank.design_pattern;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring.xml")
//@MapperScan("com.kharita.mapcloud.repository.mapper")
public class TankApplication {

    public static void main(String[] args) {
        SpringApplication.run(TankApplication.class, args);
    }

}

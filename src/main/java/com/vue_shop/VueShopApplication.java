package com.vue_shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.vue_shop.dao")
public class VueShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueShopApplication.class, args);
    }

}

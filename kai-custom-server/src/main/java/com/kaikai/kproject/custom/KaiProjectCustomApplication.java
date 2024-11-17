package com.kaikai.kproject.custom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description: 启动类
 * @create: 2024-11-16 17:44
 * @author: TangZhiKai
 **/


//scanBasePackages扫描该包下的所有东西
@SpringBootApplication(scanBasePackages = {"com.kaikai.kproject"})
//** 表示底下无论多少层都无所谓
@MapperScan({"com.kaikai.kproject.custom.**.mapper"})
public class KaiProjectCustomApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaiProjectCustomApplication.class, args);
    }

}

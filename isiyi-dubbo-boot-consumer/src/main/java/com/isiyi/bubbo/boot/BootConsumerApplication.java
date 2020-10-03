package com.isiyi.bubbo.boot;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Xiang.pf
 * @time: 2020/10/3 10:47
 */
@EnableDubbo
@SpringBootApplication
public class BootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootConsumerApplication.class, args);

    }

}

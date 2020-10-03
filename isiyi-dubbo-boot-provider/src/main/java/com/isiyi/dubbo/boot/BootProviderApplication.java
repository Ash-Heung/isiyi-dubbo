package com.isiyi.dubbo.boot;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Xiang.pf
 * @time: 2020/10/3 10:43
 */
@EnableDubbo
@SpringBootApplication
public class BootProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootProviderApplication.class);
    }
}

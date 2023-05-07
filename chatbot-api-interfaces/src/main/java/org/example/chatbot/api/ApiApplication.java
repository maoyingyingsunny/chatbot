package org.example.chatbot.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description:启动入口
 * Date: 2023/5/7
 */

@SpringBootApplication
public class ApiApplication {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(ApiApplication.class, args);
    }
}

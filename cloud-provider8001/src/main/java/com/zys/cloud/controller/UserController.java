package com.zys.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/user/get")
    public String get() {
        return "我是服务提供者，端口：" + port;
    }
}

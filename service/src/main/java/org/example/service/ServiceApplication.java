package org.example.service;

import cn.hutool.json.JSONUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("service1")
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

    @GetMapping("test1")
    public Object test1(HttpServletRequest request) {
        final String header = request.getHeader("X-Request-Foo");
        return JSONUtil.createObj()
                .set("status", "ok")
                .set("header", header)
                .set("sign", "test1");
    }


    @GetMapping("test2")
    public Object test2(HttpServletRequest request) {
        final String header = request.getHeader("X-Request-Foo");
        return JSONUtil.createObj()
                .set("status", "ok")
                .set("header", header)
                .set("sign", "test2");
    }

}

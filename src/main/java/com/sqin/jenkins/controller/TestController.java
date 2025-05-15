package com.sqin.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Qin
 * @Date 2025/5/15 10:20
 * @Description
 **/
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }

}

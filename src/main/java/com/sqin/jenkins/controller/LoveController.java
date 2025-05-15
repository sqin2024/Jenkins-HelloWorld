package com.sqin.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Qin
 * @Date 2025/5/15 10:20
 * @Description
 **/
@RestController
@RequestMapping("/love")
public class LoveController {

    @GetMapping("/forever")
    public String test() {
        return "Happiness lasts forever.";
    }

}

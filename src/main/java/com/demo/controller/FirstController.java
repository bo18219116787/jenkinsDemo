package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenjiabao
 * @date 2021/8/1 14:02
 */
@RestController
public class FirstController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Jenkins";
    }
}

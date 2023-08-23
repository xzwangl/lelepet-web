package com.lelepet.lelepetweb.service.merchant.controller;

import com.lelepet.lelepetweb.service.core.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String login() {
        redisService.set("test", "xzwang");

        return redisService.get("test");
    }

}

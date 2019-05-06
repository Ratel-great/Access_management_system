package com.wangzh.demon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/setRedis")
    public void setRedis(){
        stringRedisTemplate.opsForValue().set("a","test");
    }

    @RequestMapping("/getRedis")
    public String getRedis(){
        return stringRedisTemplate.opsForValue().get("a");
    }
}

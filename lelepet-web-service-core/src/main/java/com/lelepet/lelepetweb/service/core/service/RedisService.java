package com.lelepet.lelepetweb.service.core.service;

import jakarta.annotation.Resource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

@Service
public class RedisService {

    @Resource
    private RedisTemplate<String, Object> redisTemplate ;

    public Boolean lock(String lock,long timeout) {
        return redisTemplate.opsForValue().setIfAbsent(lock,lock,timeout, TimeUnit.SECONDS);
    }
    public void unLock(String lock) {
        Object lockVal = redisTemplate.opsForValue().get(lock);
        if (!Objects.isNull(lockVal) && Objects.equals(lockVal.toString(),lock)) {
            redisTemplate.delete(lock) ;
        }
    }

    public void set(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public String get(String key) {
        return (String) redisTemplate.opsForValue().get(key);
    }
}
package com.kgc.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate redisTemplate;

    //存数据
    public void set(String key,Object value){

        redisTemplate.opsForValue().set(key,value);
    }
    public void set(String key,Object value,long time){
        redisTemplate.opsForValue().set(key,value,time, TimeUnit.SECONDS);
    }

    //判断是否存在
    public boolean exist(String key){
        return redisTemplate.hasKey(key)==true? true:false;
    }

    //取数据
    public Object get(String key){
        if(redisTemplate.hasKey(key)) {
            return redisTemplate.opsForValue().get(key);
        }else{
            return null;
        }

    }


}

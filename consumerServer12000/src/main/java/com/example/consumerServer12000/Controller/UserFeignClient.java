package com.example.consumerServer12000.Controller;

import com.example.consumerServer12000.Entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="provider-server")
public interface UserFeignClient {

    @GetMapping("/user/getUserById/{userId}")
    public CommonResult getUserById(@PathVariable("userId") Integer userId);
}

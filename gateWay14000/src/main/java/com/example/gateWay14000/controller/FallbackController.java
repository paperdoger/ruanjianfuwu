package com.example.gateWay14000.controller;

import com.example.gateWay14000.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping("/fallback")
    public CommonResult fallbackResponse(){
        //403：发送的请求被服务器拒绝
        return new CommonResult(403,"Gateway触发了熔断降级方法",null);
    }
}

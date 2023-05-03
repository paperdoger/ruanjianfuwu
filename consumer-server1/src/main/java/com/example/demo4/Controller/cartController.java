package com.example.eurekaServer13001.Controller;

import com.example.eurekaServer13001.Entity.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class cartController {

//    -----方法一----使用restTemplate进行调用---//
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/getUserById/{userID}")
    public CommonResult getUserById(@PathVariable("userID") Integer userID){
        //通过服务提供者名（provider-server）获取Eureka Server上的元数据
        List<ServiceInstance> instanceList =
                discoveryClient.getInstances("provider-server");
        //现在，元数据集合中只有一个服务信息
        ServiceInstance instance = instanceList.get(0);

        //使用DiscoveryClient获取元数据，主机地址与端口就可以不硬编码了
        CommonResult result = restTemplate.getForObject(
                "http://provider-server/user/getUserById/"+userID, CommonResult.class);
        return result;
    }

    //-----方法二----Feign服务调用实例---//
    //注入Fegin接口（@EnableFeignClients自动扫描@FeignClient注解）
//    @Autowired
//    private UserFeignClient userFeignClient;
//
//    @GetMapping("/getUserById/{userId}")
//    public CommonResult getUserById(@PathVariable("userId") Integer userId){
//        //使用Fegin接口进行服务调用
//        return userFeignClient.getUserById(userId);
//    }
}

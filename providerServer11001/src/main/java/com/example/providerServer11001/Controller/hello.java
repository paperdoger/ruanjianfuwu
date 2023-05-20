package com.example.providerServer11001.Controller;
import org.springframework.beans.factory.annotation.Value;
import com.example.providerServer11001.Entity.CommonResult;
import com.example.providerServer11001.Entity.User;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RefreshScope //开启动态刷新
public class hello {

    //获取配置信息中的name属性值
    @Value("${spring.application.msg}")
    private String msg;

    @RequestMapping("/hello")
    public String hello(){
        return "hello!!!";
    }

    @RequestMapping("/getUserById/{userID}")
    public CommonResult<User> getuserById(@PathVariable("userID") Integer userID){
        return new CommonResult(200,"success(11001)(msg:"+msg+")",new User(userID,"李四","67890"));
    }
}

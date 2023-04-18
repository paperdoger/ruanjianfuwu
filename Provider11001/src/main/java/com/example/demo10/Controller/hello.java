package com.example.Provider11001.Controller;

import com.example.Provider11001.Entity.CommonResult;
import com.example.Provider11001.Entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class hello {
    @RequestMapping("/hello")
    public String hello(){
        return "hello!!!";
    }

    @RequestMapping("/getUserById/{userID}")
    public CommonResult<User> getuserById(@PathVariable("userID") Integer userID){
        return new CommonResult(200,"success(11001)",new User(userID,"李四","12345"));
    }
}

package com.hotelmanage.hm.controller;


import com.hotelmanage.hm.service.UserService;
import com.hotelmanage.hm.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("hello")
    public Object test1(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("list","测试0129");
        return map;
    }

    @RequestMapping("get")
    public Object get(@RequestParam String name){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("user",userService.getUserByName(name));
        return map;
    }

    @RequestMapping("getUserById")
    public Object getUserById(@RequestParam int userid){
        Map<String,Object> map = new HashMap<String, Object>();

        map.put("user",userService.getUser(userid));
        return map;
    }

    @RequestMapping("getUsers")
    public Object getUsers(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("users",userService.getAll());
        return map;
    }

    @RequestMapping("register")
    public Object register(@RequestBody UserVO user){
        Map<String,Object> map = new HashMap<String, Object>();

        ;
        int result = userService.register(user);
        if (result==1){
            map.put("status",200);
            map.put("user",user);
        }else {
            map.put("status",404);
        }
        return map;
    }

    @RequestMapping("updateInfo")
    public Object updateInfo(@RequestBody UserVO user){
        Map<String,Object> map = new HashMap<String, Object>();

        //密码加密

        int result = userService.updateUser(user);
        if (result==1){
            map.put("status",200);
            map.put("desc","修改成功");
        }else {
            map.put("status",404);
        }
        return map;
    }

    @RequestMapping("resetpsw")
    public Object resetpsw(@RequestParam String username,@RequestParam String password){
        Map<String,Object> map = new HashMap<String, Object>();

        int result = userService.resetpsw(username,password);
        if (result==1){
            map.put("status",200);
            map.put("desc","修改成功");
        }else {
            map.put("status",404);
        }
        return map;
    }

    @RequestMapping("login")
    public Object login(@RequestParam String username,@RequestParam String password) throws InterruptedException {
        Map<String,Object> map = new HashMap<String, Object>();

        UserVO gotUser = userService.login(username,password);
        if (gotUser != null){
            map.put("status",200);
            map.put("user",gotUser);
            map.put("desc","登录成功");
        }else {
            map.put("status",404);
            map.put("desc","登录失败");
        }
        return map;
    }
}

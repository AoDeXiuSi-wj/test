package com.ssm.test.controller;

import com.ssm.test.entity.PUser;
import com.ssm.test.service.PUserSerivce;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.logging.Logger;

@Controller
@RequestMapping("/user")
public class ViewController {

    private Logger logger = Logger.getLogger(String.valueOf(ViewController.class));

    @Resource(name = "PUserService")
    private PUserSerivce pUserService;

    @RequestMapping("/index")
    public String index(){

        return "index";
    }

    @RequestMapping("/find")
    @ResponseBody
    public Map<String,Object> find(PUser pUser, HttpServletRequest request){

        Map<String,Object> map = new HashedMap();
        System.out.println("你已通过springMVC进入controller方法。。。。");
        logger.info("你已通过springMVC进入controller方法。。。。");
        PUser loginuser = pUserService.findByUsernameAndPwd(pUser.getUsername(),pUser.getPassword());
        if(loginuser != null){
            map.put("result","success");
        }else {
            map.put("result","fail");
        }
        return map;
    }

    @RequestMapping("/success")
    public String success(){
        System.out.println("登录成功。。。。");
        logger.info("登录成功。。。。");

        return "success";
    }

}


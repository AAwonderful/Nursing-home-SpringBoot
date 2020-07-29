package com.lijie.bs_healthy.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Controller: 当前类是控制器
 * @RequestMapping: url访问路径
 * @ResponseBody: 返回JSON数据
 * RestController: 当前类是控制器,所有的方法都是返回JSON
 * test/demo
 * test/demo1
 */
@RestController
@RequestMapping("/test")
public class TestController{



    @RequestMapping("demo1")
    public Map<String,Object> demo1(){
        System.out.println("demo1");
        Map<String,Object> hm = new HashMap<>();
        hm.put("name","张三");
        return hm;
    }


}

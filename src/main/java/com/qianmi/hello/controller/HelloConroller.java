package com.qianmi.hello.controller;

import com.qianmi.hello.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 * <p>
 * <p>FileName: com.qianmi.hello.controller.HelloConroller</p>
 * <p>Date: 2017-08-17 09:42.</p>
 *
 * @author <a href="mailto:lilonglong@qianmi.com">of2639-李龙龙</a>
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloConroller {

    @Autowired
    private StoreService storeService;

    @RequestMapping("/myname")
    public String getMyName(){
        storeService.getMyName("A910917");
        return "hello word!";
    }
}

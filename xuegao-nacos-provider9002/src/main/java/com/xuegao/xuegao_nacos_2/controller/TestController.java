package com.xuegao.xuegao_nacos_2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br/> @PackageName：com.xuegao.xuegao_nacos.controller
 * <br/> @ClassName：TestController
 * <br/> @Description：
 * <br/> @author：feijm
 * <br/> @date：2020/8/18 0:38
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String serverPort;

    // http://localhost:12000/echo/aaa
    // hello nacos discover = 12000 === aaa

    @RequestMapping(value = "/payment/nacos/{id}", method = RequestMethod.GET)
    public String echo(@PathVariable String id) {
        return "hello nacos serverPort = " + serverPort + " === " + id;
    }

}
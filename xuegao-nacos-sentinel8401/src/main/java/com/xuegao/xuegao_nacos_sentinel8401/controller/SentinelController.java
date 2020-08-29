package com.xuegao.xuegao_nacos_sentinel8401.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br/> @PackageName：com.xuegao.xuegao_nacos_sentinel8401.controller
 * <br/> @ClassName：SentinelController
 * <br/> @Description：
 * <br/> @author：feijm
 * <br/> @date：2020/8/27 0:17
 */
@RestController
public class SentinelController {

    @RequestMapping(path = "/testA", method = RequestMethod.GET)
    public String testA() {

        return "===========testA=============";
    }

    @RequestMapping(path = "/testB", method = RequestMethod.GET)
    public String testB() {

        return "===========testB=============";
    }

}
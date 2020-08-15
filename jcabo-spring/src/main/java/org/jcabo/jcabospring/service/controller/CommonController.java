package org.jcabo.jcabospring.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    // 日志组件
    private static final Logger logger = LoggerFactory.getLogger(CommonController.class);

    @RequestMapping("/test01")
    public String testController() throws Exception{
        logger.info("in test01");
        return "test01 hello world";
    }

}

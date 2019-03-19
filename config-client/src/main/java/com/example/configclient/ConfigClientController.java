package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author merz
 * @Description:
 * @date 2019/3/19 22:41
 */
@RestController
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class ConfigClientController {

    @Value("${writer}")
    String writer;

    @RequestMapping(value = "/writer")
    public String writer() {
        return writer;
    }

}

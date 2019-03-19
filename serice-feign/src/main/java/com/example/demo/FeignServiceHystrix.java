package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author merz
 * @Description: 熔断处理
 * @date 2019/3/19 21:07
 */
@Component
public class FeignServiceHystrix implements FeignExampleService {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "sorry "+name+"，service has fail!";
    }
}

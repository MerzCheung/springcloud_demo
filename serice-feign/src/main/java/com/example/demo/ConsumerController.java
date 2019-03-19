package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Merz
 * @Description:
 * @date 2019/3/19
 */
@RestController
public class ConsumerController {
    @Resource
    private FeignExampleService feignExampleService;

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return feignExampleService.hello(name);
    }
}

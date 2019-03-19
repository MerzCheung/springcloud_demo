package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Merz
 * @Description:
 * @date 2019/3/19
 */
@FeignClient(value = "service-producer")
public interface FeignExampleService {

    @GetMapping("hello")
    public String hello(@RequestParam(value = "name") String name);

}

package com.piggsoft.auto.operator.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by piggs on 2017/8/17.
 */
@RestController
@RequestMapping("/")
public class ApiController {

    @Value("${unicom.url}")
    public String unicom_url;

    @RequestMapping
    public String hello() {
        return unicom_url;
    }

}

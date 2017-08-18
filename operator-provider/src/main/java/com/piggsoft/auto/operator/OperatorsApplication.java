package com.piggsoft.auto.operator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by piggs on 2017/8/17.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OperatorsApplication {

    public static void main(String[] args) {
        SpringApplication.run(OperatorsApplication.class, args);
    }

}

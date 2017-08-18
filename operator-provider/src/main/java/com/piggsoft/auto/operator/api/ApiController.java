package com.piggsoft.auto.operator.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;

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
        RestTemplate restTemplate = new RestTemplate();
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://jisutqybmf.market.alicloudapi.com/weather/query");
        builder.queryParam("city", "武汉");
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("Authorization", "APPCODE 71a8595912394bd8a3dd3bda6e8db363");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        HttpEntity<String> response = restTemplate.exchange(builder.build().encode().toUri(), HttpMethod.GET, entity, String.class);
        return unicom_url +"====" + response.getBody();
    }

}

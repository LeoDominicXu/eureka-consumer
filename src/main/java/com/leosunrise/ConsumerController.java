package com.leosunrise;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by xuzichao on 2017/6/28.
 */
@RestController
public class ConsumerController {
    @Resource
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }
}

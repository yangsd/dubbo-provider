package com.provider.service;

import com.service.IHelloService;
import org.springframework.stereotype.Component;

/**
 * Created by sdyang on 2016/6/13.
 */
@Component("hello")
public class HelloService implements IHelloService {

    public String sayHello(String name) {
        return "Hi,This is "+name +" !";
    }
}

package com.demo.serviceimpl;

import com.demo.service.Demo;
import org.springframework.stereotype.Component;

/**
 * Created by sdyang on 2016/6/13.
 */
@Component("demo")
public class DemoImpl implements Demo {

    public String sayHello(String name) {
        return "Hi,"+name;
    }
}

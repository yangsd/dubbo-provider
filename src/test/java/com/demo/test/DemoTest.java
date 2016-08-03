package com.demo.test;

import com.ProviderApplication;
import com.service.IHelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by sdyang on 2016/6/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProviderApplication.class)
public class DemoTest {

    @Resource
    private IHelloService demoService;

    @Test
    public void test() throws InterruptedException {
       String str = demoService.sayHello("test");
        System.out.println(str);
    }
}

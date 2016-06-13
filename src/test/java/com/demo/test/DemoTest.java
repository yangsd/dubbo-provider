package com.demo.test;

import com.demo.service.Demo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Random;

/**
 * Created by sdyang on 2016/6/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-dubbo-consumer.xml","classpath:spring-context.xml"})
public class DemoTest {

    @Resource
    private Demo demoService;

    @Test
    public void test() throws InterruptedException {
       String str = demoService.sayHello("test");
        System.out.println(str);
    }
}

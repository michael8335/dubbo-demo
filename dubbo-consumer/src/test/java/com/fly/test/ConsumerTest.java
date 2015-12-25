package com.fly.test;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fly.api.UserService;


public class ConsumerTest
{

    @Test
    public void test()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            new String[] {"dubbo-consumer.xml"});
        context.start();
        UserService userService = (UserService)context.getBean("userService");
        System.out.println(userService.getUserInfo(1).getName());
    }

}

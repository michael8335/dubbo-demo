package com.fly.dubbo.rpc;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fly.api.UserService;


public class RpcContext
{
    private static UserService userService = null;;

    private static ClassPathXmlApplicationContext context = null;
    static
    {
        context = new ClassPathXmlApplicationContext(new String[] {"dubbo-consumer.xml"});
        context.start();
    }

    public synchronized static UserService getRemoteUserService()
    {
        if (userService == null)
        {
            userService = (UserService)context.getBean("userService");
        }
        return userService;
    }
}
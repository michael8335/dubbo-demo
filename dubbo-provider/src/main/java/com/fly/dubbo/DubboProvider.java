package com.fly.dubbo;


import java.io.IOException;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DubboProvider
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            new String[] {"dubbo-provider.xml"});
        context.start();
        System.out.println("demo provider started.......");
        while (true)
        {
            try
            {
                Thread.currentThread().sleep(5*1000);
                System.out.println("demo provider heartbeat at:"+(new Date().getTime()/1000));
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

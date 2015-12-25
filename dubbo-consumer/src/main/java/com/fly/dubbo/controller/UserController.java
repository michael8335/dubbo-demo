package com.fly.dubbo.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.fly.dubbo.logic.UserLogic;


@Controller
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserLogic userLogic;

    @ResponseBody
    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String getUser(HttpServletRequest request)
    {
        String uid = request.getParameter("uid");
        int userID = 0;
        if (null != uid && !"".equals(uid))
        {
            userID = Integer.parseInt(uid);
        }
        return JSON.toJSONString(userLogic.getUser(userID));
    }
}
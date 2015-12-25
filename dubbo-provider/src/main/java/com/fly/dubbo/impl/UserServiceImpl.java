package com.fly.dubbo.impl;


import com.fly.api.UserService;
import com.fly.api.model.User;


public class UserServiceImpl implements UserService
{
    @Override
    public User getUserInfo(int id)
    {
        return new User(id, "name" + id, "password" + id);
    }

}
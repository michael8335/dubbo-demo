package com.fly.dubbo.logic;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.fly.api.model.User;
import com.fly.dubbo.rpc.RpcContext;


@Service("userLogic")
@Scope("singleton")
public class UserLogic
{


    public User getUser(int id)
    {
        return RpcContext.getRemoteUserService().getUserInfo(id);
    }

}

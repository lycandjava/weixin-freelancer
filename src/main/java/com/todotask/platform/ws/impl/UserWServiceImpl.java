package com.todotask.platform.ws.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;

import com.todotask.platform.model.User;
import com.todotask.platform.service.sys.impl.UserServiceImpl;
import com.todotask.platform.ws.IUserWService;

@WebService(endpointInterface = "com.todotask.platform.ws.IUserWService" ,serviceName = "userWService")  
public class UserWServiceImpl implements IUserWService {

    @Resource
    UserServiceImpl userServiceImpl;
    
    @Override
    public boolean createUser(User user) {
        int result  = userServiceImpl.insert(user);
        return result > 0 ;
    }

    @Override
    public boolean deleteUser(String username, String password, String SystemID, String key, String deleteUserID) {
        Map<String,Object> param = new HashMap<String,Object>();
        param.put("id", deleteUserID);
       int result = userServiceImpl.deleteParam(param);
        return result  > 0 ;
    }

    @Override
    public boolean modifyUser(String username, String password, String SystemID, String key, String deleteUserID) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setSourceSystem(SystemID);
        user.setId(deleteUserID);
        int result  = userServiceImpl.update(user);
        return result > 0 ;
    }

    @Override
    public List<User> findAllUserBySystem(String systemID) {
        Map<String,Object> param  = new HashMap<String,Object>();
        param.put("sourceSystem", systemID);
        List<User> list  = userServiceImpl.selectParam(param);
        return list;
    }

    @Override
    public String[] findAllUserByType(String typeID) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String predictValidUser(String username, String password) { 
        String result  = "no";
        Map<String,Object> param  = new HashMap<String,Object>();
        param.put("username", username);
        param.put("password", password);
        List<User> list  = userServiceImpl.selectParam(param);
        if(list!=null && list.size()>0){
            result ="yes"; 
        }
        return result;
    }

    @Override
    public String[] getAllPriByUser(String userId) {
        userServiceImpl.getAllPriByUser(userId);
        return null;
    }
}

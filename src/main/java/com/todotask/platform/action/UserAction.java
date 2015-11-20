package com.todotask.platform.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.todotask.platform.model.User;
import com.todotask.platform.service.sys.IUserService;
import com.todotask.platform.service.sys.impl.UserServiceImpl;

public class UserAction extends BaseActionSupport {
    private List<User> userList  ;
    private User user;
    @Autowired
    UserServiceImpl userServiceImpl;
    public List<User> getUserList() {
        return userList;
    }
    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
    public String execute(){
        userList = userServiceImpl.selectParam(null);
        return SUCCESSED;
    }
    
    public boolean createUser(){
        int count = userServiceImpl.insert(user);
        return count >0;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

}

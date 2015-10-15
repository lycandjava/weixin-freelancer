package com.todotask.platform.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.todotask.platform.model.User;
import com.todotask.platform.service.sys.IUserService;

public class UserAction extends BaseActionSupport {
    private List<User> userList  ;
    @Autowired
    IUserService userService;
    public List<User> getUserList() {
        return userList;
    }
    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
    public String execute(){
        userList = userService.queryUserList();
        return SUCCESSED;
    }
}

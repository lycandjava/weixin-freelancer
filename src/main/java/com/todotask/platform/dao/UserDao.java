package com.todotask.platform.dao;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.todotask.platform.model.User;

@Repository
public class UserDao extends MybatisBaseDao<User, Serializable> {

}

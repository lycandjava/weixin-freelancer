package com.todotask.platform.service.sys.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.todotask.platform.dao.IBaseDao;
import com.todotask.platform.dao.UserDao;
import com.todotask.platform.model.User;
import com.todotask.platform.service.sys.AbstractBaseService;

/**
 * <p>
 * Title: UserServiceImpl.java
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2002-2015
 * </p>
 * <p>
 * Company: 神州数码信息系统有限公司
 * </p>
 * 
 * @author liyci
 * @date 2015年6月26日
 * @version 1.0.0
 */
@Service
public class UserServiceImpl extends AbstractBaseService<User, Serializable> {

	@Resource
	private UserDao userDao;

	@Override  
	public IBaseDao<User, Serializable> getDao() {
		return userDao;
	}
	
	public String[] getAllPriByUser(String userId){
	    return null;
	}
}

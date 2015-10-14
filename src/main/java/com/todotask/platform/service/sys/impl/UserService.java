package com.todotask.platform.service.sys.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.todotask.platform.dao.UserDao;
import com.todotask.platform.model.User;
import com.todotask.platform.service.sys.IUserService;

/**
 * 
 * <p>
 * Title: UserService.java
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2002-2014
 * </p>
 * <p>
 * Company: 神州数码信息系统有限公司
 * </p>
 * 
 * @author liyci
 * @date 2015年6月23日
 * @version 1.0.0
 */
@Service
public class UserService implements IUserService {
	@Resource
	private UserDao userDao;

	public List<User> queryUserList() {
		System.out.println("query user list ... ");
		Map<String, Object> param = new HashMap<String, Object>();
		List<User> users = userDao.selectParam(param);
		return users;
	}
}

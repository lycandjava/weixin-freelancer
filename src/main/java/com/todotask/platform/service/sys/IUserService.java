package com.todotask.platform.service.sys;

import java.util.List;

import com.todotask.platform.model.User;

/**
 * 
 * <p>
 * Title: IUserService.java
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
public interface IUserService {
	public List<User> queryUserList();
}

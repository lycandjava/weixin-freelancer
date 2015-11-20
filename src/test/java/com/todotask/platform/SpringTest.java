package com.todotask.platform;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.todotask.platform.dao.UserDao;
import com.todotask.platform.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:config/spring.xml",
		"classpath*:config/spring-mybatis.xml", "classpath*:config/spring-mvc.xml",
		"classpath*:config/mybatis-config.xml" })
public class SpringTest extends AbstractJUnit4SpringContextTests {
	public <T> T getBean(Class<T> type) {
		return applicationContext.getBean(type);
	}

	public Object getBean(String beanName) {
		return applicationContext.getBean(beanName);
	}

	protected ApplicationContext getContext() {
		return applicationContext;
	}
	
	@Autowired
	UserDao userDao ;
	
	@Test
	public void testUser(){
	    List<User> list  = userDao.select();
	}
}

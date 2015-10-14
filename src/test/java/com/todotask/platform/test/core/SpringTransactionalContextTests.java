package com.todotask.platform.test.core;

import javax.sql.DataSource;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>
 * Title: SpringTransactionalContextTests.java
 * </p>
 * <p>
 * Description: 单元测试基类
 * </p>
 * <p>
 * Copyright: Copyright (c) 2002-2015
 * </p>
 * <p>
 * Company: 神州数码信息系统有限公司
 * </p>
 * 
 * @author liyci
 * @date 2015年6月17日
 * @version 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "spring.xml", "spring-mybatis.xml",
		"spring-mvc.xml", "mybatis-config.xml" })
public class SpringTransactionalContextTests extends
		AbstractTransactionalJUnit4SpringContextTests {

	protected DataSource dataSource;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
		this.dataSource = dataSource;
	}
}

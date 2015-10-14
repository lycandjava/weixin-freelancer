package com.todotask.platform.service.sys;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.todotask.platform.dao.IBaseDao;
import com.todotask.platform.model.Page;
import com.todotask.platform.model.Pagination;

/**
 * <p>
 * Title: AbstractBaseService.java
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
public abstract class AbstractBaseService<T, PK extends Serializable> implements IBaseService<T, PK> {

	/**
	 * 
	 * <p>
	 * Title: getDao
	 * </p>
	 * <p>
	 * Description:获取到的实现累接口
	 * </p>
	 * 
	 * @return
	 * @author liyci
	 * @since 2015年6月26日
	 */
	public abstract IBaseDao<T, PK> getDao();

	@Override
	public int insert(T entity) {
		return getDao().insert(entity);
	}

	@Override
	public int update(T entity) {
		return getDao().update(entity);
	}

	@Override
	public int updateParam(Map param) {
		return getDao().updateParam(param);
	}

	@Override
	public int delete(PK primaryKey) {
		return getDao().delete(primaryKey);
	}

	@Override
	public int deleteParam(Map param) {
		return getDao().deleteParam(param);
	}

	@Override
	public int truncate() {
		return getDao().truncate();
	}

	@Override
	public int count() {
		return getDao().count();
	}

	@Override
	public int count(Object param) {
		return getDao().count(param);
	}

	@Override
	public T selectPk(PK primaryKey) {
		return getDao().selectPk(primaryKey);
	}

	@Override
	public T selectMap(Map param) {
		return getDao().selectMap(param);
	}

	@Override
	public List<T> select() {
		return getDao().select();
	}

	@Override
	public List<T> selectParam(Map param) {
		return getDao().selectParam(param);
	}

	@Override
	public Pagination<T> selectPagination(Page param) {
		return getDao().selectPagination(param);
	}

	@Override
	public int insertBatch(List<T> list) {
		return getDao().insertBatch(list);
	}

	@Override
	public int updateBatch(List<T> list) {
		return getDao().updateBatch(list);
	}

	@Override
	public int deleteBatch(List<PK> list) {
		return getDao().deleteBatch(list);
	}

}

package com.todotask.platform.dao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.todotask.platform.model.Page;
import com.todotask.platform.model.Pagination;

/**
 * <p>
 * Title: MybatisBaseDao.java
 * </p>
 * <p>
 * Description:数据库基类实现
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
public class MybatisBaseDao<T, PK extends Serializable> extends
		SqlSessionDaoSupport implements IBaseDao<T, PK> {

	/**
	 * 日志
	 */
	private static final Log logger  = LogFactory.getLog(MybatisBaseDao.class);
	// mapper.xml中的namespace
	private String namespace = this.getClass().getName();

	@Resource(name = "sqlSessionTemplate")
	public void setSuperSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	@Override
	public int insert(T entity) {
		int rows = 0;
		try {
			rows = getSqlSession().insert(namespace + "." + SQLID_INSERT,entity);
		} catch (Exception e) {
			String loggerDesc = "执行插入操作【"+namespace+"." + SQLID_INSERT+"】 失败";
			logger.error(loggerDesc,e);
		}
		return rows;
	}

	@Override
	public int update(T entity) {
		int rows = 0;
		try {
			rows = getSqlSession().update(namespace + "." + SQLID_UPDATE,
					entity);
		} catch (Exception e) {
			String loggerDesc = "执行更新操作【"+namespace+"." + SQLID_UPDATE+"】 失败";
			logger.error(loggerDesc,e);
		}
		return rows;
	}

	@Override
	public int updateParam(Map param) {
		int rows = 0;
		try {
			rows = getSqlSession().update(namespace + "." + SQLID_UPDATE_PARAM,
					param);
		} catch (Exception e) {
			String loggerDesc = "执行更新操作【"+namespace+"." + SQLID_UPDATE_PARAM+"】 失败,参数为："+param;
			logger.error(loggerDesc,e);
		}
		return rows;
	}

	@Override
	public int delete(PK primaryKey) {
		int rows = 0;
		try {
			rows = getSqlSession().delete(namespace + "." + SQLID_DELETE,
					primaryKey);
		} catch (Exception e) {
			String loggerDesc = "执行删除操作【"+namespace+"." + SQLID_DELETE+"】 失败";
			logger.error(loggerDesc,e);
		}
		return rows;
	}

	@Override
	public int deleteParam(Map param) {
		int rows = 0;
		try {
			rows = getSqlSession().delete(namespace + "." + SQLID_DELETE_PARAM,
					param);
		} catch (Exception e) {
			String loggerDesc = "执行删除操作【"+namespace+"." + SQLID_DELETE_PARAM+"】 失败,参数为："+param;
			logger.error(loggerDesc,e);
		}
		return rows;
	}

	@Override
	public int truncate() {
		int rows = 0;
		try {
			rows = getSqlSession().delete(namespace + "." + SQLID_TRUNCATE);
		} catch (Exception e) {
			String loggerDesc = "执行删除(truncate)操作【"+namespace+"." + SQLID_TRUNCATE+"】 失败";
			logger.error(loggerDesc,e);
		}
		return rows;
	}

	@Override
	public int count() {
		int result = 0;
		try {
			result = getSqlSession().selectOne(namespace + "." + SQLID_COUNT);
		} catch (Exception e) {
			String loggerDesc = "执行count查询操作【"+namespace+"." + SQLID_COUNT+"】 失败";
			logger.error(loggerDesc,e);
		}
		return result;
	}

	@Override
	public int count(Object param) {
		int result = 0;
		try {
			result = getSqlSession().selectOne(namespace + "." + SQLID_COUNT_PARAM, param);
		} catch (Exception e) {
			String loggerDesc = "执行count查询操作【"+namespace+"." + SQLID_COUNT_PARAM+"】 失败,参数为："+param;
			logger.error(loggerDesc,e);
		}
		return result;
	}

	@Override
	public T selectPk(PK primaryKey) {
		try {
			return getSqlSession().selectOne(namespace + "." + SQLID_SELECT_PK,
					primaryKey);
		} catch (Exception e) {
			String loggerDesc = "执行ID查询操作【"+namespace+"." + SQLID_SELECT_PK+"】 失败,主键为："+primaryKey;
			logger.error(loggerDesc,e);
			return null;
		}
	}

	@Override
	public T selectMap(Map param) {
		try {
			return getSqlSession().selectOne(namespace + "." + SQLID_SELECT_MAP, param);
		} catch (Exception e) {
			String loggerDesc = "执行查询操作【"+namespace+"." + SQLID_SELECT_MAP+"】 失败";
			logger.error(loggerDesc,e);
			return null;
		}

	}
	
	@Override
	public List<T> select() {
		try {
			return getSqlSession().selectList(namespace + "." + SQLID_SELECT);
		} catch (Exception e) {
			String loggerDesc = "执行查询操作【"+namespace+"." + SQLID_SELECT+"】 失败";
			logger.error(loggerDesc,e);
			return null;
		}

	}

	@Override
	public List<T> selectParam(Map param) {
		try {
			printLog(namespace + "."+SQLID_SELECT_PARAM,param);
			return getSqlSession().selectList(
					namespace + "." + SQLID_SELECT_PARAM, param);
		} catch (Exception e) {
			String loggerDesc = "执行查询操作【"+namespace+"." + SQLID_SELECT_PARAM+"】 失败,主参数为："+param;
			logger.error(loggerDesc,e);
			return null;
		}
	}

	@Override
	public Pagination<T> selectPagination(Page pageEntity) {
		try {
			RowBounds rowBounds = new RowBounds((pageEntity.getPageNo() - 1) * pageEntity.getSize(), pageEntity.getSize());
			Map param = pageEntity.getParams();
			if (param != null) {
				param.put("orderColumn", pageEntity.getOrderColumn());
				param.put("orderTurn", pageEntity.getOrderTurn());
			} else {
				param = new HashMap();
				param.put("orderColumn", pageEntity.getOrderColumn());
				param.put("orderTurn", pageEntity.getOrderTurn());
			}


			printLog(namespace + "."+SQLID_SELECT_PARAM,param);
			List<T> resultList = getSqlSession().selectList(
					namespace + "." + SQLID_SELECT_PARAM, param, rowBounds);
			int totalSize = count(pageEntity.getParams());

			Pagination<T> pagingResult = new Pagination<T>();
			pagingResult.setCurrentPage(pageEntity.getPageNo());
			// eg：11/10 = 2
			pagingResult.setPageSize((totalSize%10 == 0)?(totalSize/10):(totalSize/10+1));
			pagingResult.setTotalSize(totalSize);
			pagingResult.setResultList(resultList);
			return pagingResult;
		} catch (Exception e) {
			String loggerDesc = "执行分页查询操作【"+namespace+"." + SQLID_SELECT_PARAM+"】 失败";
			logger.error(loggerDesc,e);
			return null;
		}
	}

	@Override
	public int insertBatch(List<T> list) {
		try {
			return getSqlSession().insert(namespace + "." + SQLID_INSERT_BATCH,
					list);
		} catch (Exception e) {
			String loggerDesc = "执行批量插入操作【"+namespace+"." + SQLID_INSERT_BATCH+"】 失败";
			logger.error(loggerDesc,e);
			return 0;
		}
	}

	@Override
	public int updateBatch(List<T> list) {
		int rows = 0;
		try {
			for (T t : list) {
				rows = rows + getSqlSession().update(namespace + "." + SQLID_UPDATE, t);
			}
		} catch (Exception e) {
			String loggerDesc = "执行批量更新操作【"+namespace+"." + SQLID_UPDATE+"】 失败";
			logger.error(loggerDesc,e);
		}
		return rows;
	}

	@Override
	public int deleteBatch(List<PK> list) {
		try {
			return getSqlSession().delete(namespace + "." + SQLID_DELETE_BATCH,
					list);
		} catch (Exception e) {
			String loggerDesc = "执行批量删除操作【"+namespace+"." + SQLID_DELETE_BATCH+"】 失败";
			logger.error(loggerDesc,e);
			return 0;
		}
	}

	/**
	 * 日志打印
	 * 
	 * @param sqlId
	 * @param param
	 */
	private void printLog(String sqlId, Object param) {
		Configuration configuration = getSqlSession().getConfiguration();
		// sqlId为配置文件中的sqlid
		MappedStatement mappedStatement = configuration.getMappedStatement(sqlId);
		// param为传入到sql语句中的参数
		BoundSql boundSql = mappedStatement.getBoundSql(param);
		transferSqlWithParams(boundSql);
	}  
	
	private void transferSqlWithParams(BoundSql boundSql){
		String sql = boundSql.getSql().trim();
		List<ParameterMapping> list  = boundSql.getParameterMappings();
		Map<String,Object> map = (Map<String, Object>)  boundSql.getParameterObject();
		for (ParameterMapping parameterMapping : list) {
			if(map.get(parameterMapping.getProperty()) instanceof String){
				sql = sql.replace("?", "'"+map.get(parameterMapping.getProperty())+"'");
			}else{
				sql = sql.replace("?", map.get(parameterMapping.getProperty())+"");
			}
		}
		logger.info(sql);
		
	}

}

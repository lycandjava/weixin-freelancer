package com.todotask.platform.action;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseActionSupport extends ActionSupport implements SessionAware,
		ServletRequestAware, ServletResponseAware {

	
	protected Object object;
	protected List objects;
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = -7839184724884094258L;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected Map session;
	
	protected static final String SUCCESSED = "success";
	protected static final String LIST = "list";
	/**
	 * 返回结果类型：查看详细信息
	 */
	protected static final String VIEW = "view";
	/**
	 * 返回结果类型：JSON数据类型
	 */
	protected static final String JSON = "json";

	/**
	 * 返回结果类型：JSON数据列表类型
	 */
	protected static final String JSONS = "jsons";

	/**
	 * 返回结果类型：XML数据类型
	 */
	protected static final String XML = "xml";

	/**
	 * 返回结果类型：XML数据列表类型
	 */
	protected static final String XMLS = "xmls";

	/**
	 * 返回结果类型：空JSON对象
	 */
	protected static final String DUMP = "dump";

	/**
	 * 返回结果类型：value值
	 */
	protected static final String VALUE = "value";

	public String json() {
		return "json";
	}

	public String jsons() {
		return "jsons";
	}

	public String xml() {
		return "xml";
	}

	public String xmls() {
		return "xmls";
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public List getObjects() {
		return objects;
	}

	public void setObjects(List objects) {
		this.objects = objects;
	}
	
	
	public String getNumber(String a){
		String num = null;
		DecimalFormat df1 = new DecimalFormat("####0.00");
		num = df1.format(Float.parseFloat(a));
		return num;
	}
 
	public String getSSOUser(){
		return request.getRemoteUser();
	}
}
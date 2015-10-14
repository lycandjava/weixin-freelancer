package com.todotask.platform.interceptors;

import java.io.UnsupportedEncodingException;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class EncodingInterceptor extends AbstractInterceptor {
	private static final Log logger = LogFactory
			.getLog(EncodingInterceptor.class);
	private static final long serialVersionUID = 4228963698095242755L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		ActionContext actionContext = arg0.getInvocationContext();
		HttpServletRequest request = (HttpServletRequest) actionContext
				.get(StrutsStatics.HTTP_REQUEST);
	 
		if (request.getMethod().compareToIgnoreCase("post") >= 0) {
			try {
				request.setCharacterEncoding("UTF-8");
			} catch (UnsupportedEncodingException e) {
				logger.error("EncodingInterceptor Interceptor post :", e);
			}
		} else {
			Iterator iter = request.getParameterMap().values().iterator();
			while (iter.hasNext()) {
				String[] parames = (String[]) iter.next();
				for (int i = 0; i < parames.length; i++) {
					try {
						parames[i] = new String(
								parames[i].getBytes("iso8859-1"), "UTF-8");// �˴�GBK��ҳ�����һ��
					} catch (UnsupportedEncodingException e) {
						logger.error("EncodingInterceptor Interceptor get:", e);
					}
				}
			}
		}
		return arg0.invoke(); 
	}
}

package com.todotask.platform.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import ognl.DefaultTypeConverter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * <p>
 * Title: MediumDateConverter.java
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
public class MediumDateConverter extends DefaultTypeConverter {
	private Log LOG = LogFactory.getLog(MediumDateConverter.class);

	@Override
	public Object convertValue(Map context, Object value, Class toType) {
		SimpleDateFormat mediumFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat shortFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			if (toType == Date.class) {// ���ַ���Date����ת��ʱ
				String[] params = (String[]) value;
				if (params[0] == null || params[0].trim().equals("")) {
					return null;
				} else if (params[0].length() > 10) {
					return mediumFormat.parse(params[0]);
				} else {
					return shortFormat.parse(params[0]);
				}
			} else if (toType == String.class) {// ��Dateת�����ַ�ʱ
				Date date = (Date) value;
				return mediumFormat.format(date);
			}
		} catch (ParseException e) {
			LOG.error(e.getMessage(), e);
		}
		return null;
	}
}
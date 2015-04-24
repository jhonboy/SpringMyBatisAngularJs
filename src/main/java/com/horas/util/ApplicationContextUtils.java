/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horas.util;

import com.horas.constant.GlobalSession;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author jhon
 */
public class ApplicationContextUtils extends GlobalSession implements ApplicationContextAware  {

	private static ApplicationContext ctx;

	@Override
	public void setApplicationContext(ApplicationContext appContext)
			throws BeansException {
		ctx = appContext;

	}

	public static ApplicationContext getApplicationContext() {
		return ctx;
	}
}

/**
 *
 * @author : liuxiaoqiang
 * @date   :Mar 11, 2016 5:12:21 PM 
 * @version 1.0 
 *
 */
package com.reus;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class HelloListener implements ServletContextListener  {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Hello from: " + this);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
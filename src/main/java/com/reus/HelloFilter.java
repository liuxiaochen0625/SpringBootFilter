/**
 *
 * @author : liuxiaoqiang
 * @date   :Mar 11, 2016 5:11:34 PM 
 * @version 1.0 
 *
 */
package com.reus;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class HelloFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		System.out.println("Before: " + request);
		chain.doFilter(request, response);
		System.out.println("After: " + request);
	}

	@Override
	public void destroy() {

	}

}
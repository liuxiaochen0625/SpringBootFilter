/**
 *
 * @author : liuxiaoqiang
 * @date   :Mar 11, 2016 5:12:53 PM 
 * @version 1.0 
 *
 */
package com.reus;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

@WebServlet(value = "/hello", name = "hello-servlet")
public class HelloServlet extends GenericServlet {
	
	private static final long serialVersionUID = 1L;
	@Autowired Environment env;

	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
		res.getWriter().println("Hello World!");
		res.getWriter().println(env.toString());
	}
}

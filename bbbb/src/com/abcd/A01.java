package com.abcd;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class A01 implements Servlet{
	public A01() {
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		String a=arg0.getInitParameter("user");
		String b=arg0.getInitParameter("password");
		System.out.println(a);
		System.out.println(b);
		
		Enumeration<String> names=arg0.getInitParameterNames();
		while(names.hasMoreElements()) {
			String a1 =names.nextElement();
			String b1 =arg0.getInitParameter(a);
			System.out.println(a+":"+b);
		}
		
		ServletContext a1 = arg0.getServletContext();
		String b1=a1.getInitParameter("dri");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}

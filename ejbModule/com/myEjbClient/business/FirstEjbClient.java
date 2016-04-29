package com.myEjbClient.business;

import static org.junit.Assert.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Test;

/**
 * @author: Sophist Wu
 * @mailTo: sophistwu@outlook.com
 * @createDate: 2016年2月3日 下午2:46:44 
 * @desc: 
 * 
 */
public class FirstEjbClient {
	@Test
	public void testName() throws Exception {
	}
	
	public static void main(String[] args) throws NamingException {

		InitialContext ctx = new InitialContext();
		FirstEjb firstEjb = (FirstEjb) ctx.lookup("FirstEjbBean/remote");
		String s = firstEjb.saySomething("张三");
		System.out.println(s);
	}
}


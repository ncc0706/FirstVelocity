package com.xlinyu.model;

import java.io.StringWriter;
import java.util.Date;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.junit.Test;

public class UserTest {

	@Test
	public void test() {
		VelocityEngine ve = new VelocityEngine();
		ve.init();
		Template template = ve.getTemplate("templates/User.vm");
		VelocityContext context = new VelocityContext();
		User user = new User();
		user.setId(1);
		user.setName("张三");
		user.setPassword("abc123");
		user.setEmail("zs@gmail.com");
		user.setBirthday(new Date());
		context.put("user", user);
		
		StringWriter writer = new StringWriter();
		
		template.merge(context, writer);
		
		System.out.println(writer.toString());
	}

}

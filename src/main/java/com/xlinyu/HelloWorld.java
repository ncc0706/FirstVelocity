package com.xlinyu;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class HelloWorld {

	public static void main(String[] args) {
		VelocityEngine ve = new VelocityEngine();
		ve.init();
		
		Template template = ve.getTemplate("templates/HelloWorld.vm");
		
		VelocityContext context = new VelocityContext();
		context.put("welcome", "Hello World --> 你好");
		
		StringWriter writer = new StringWriter();
		
		template.merge(context, writer);
		
		System.out.println(writer.toString());
		
		
	}
	
}

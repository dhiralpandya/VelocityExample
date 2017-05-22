package com.omt.velocity.example;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import com.omt.velocity.Customer;

public class VelocityContextExample {

	public VelocityContextExample() {
	}

	public static void main(String[] args) {
		innerMapContext();
	}

	private static void simpleKeyValueContext() {

		Velocity.init();

		VelocityContext context = new VelocityContext();
		context.put("name", "omtlab");

		Template t = Velocity.getTemplate("context.vm");

		StringWriter writer = new StringWriter();
		t.merge(context, writer);

		System.out.println(writer.toString());
	}

	private static void beanInContext() {
		Velocity.init();

		VelocityContext context = new VelocityContext();
		Customer c = new Customer();

		c.setName("Dhiral Pandya");
		c.setCompany("omt");

		context.put("customerBean", c);
		context.put("name", "omtlab");

		Template t = Velocity.getTemplate("beancontext.vm");

		StringWriter writer = new StringWriter();
		t.merge(context, writer);

		System.out.println(writer.toString());
	}

	private static void innerMapContext() {
		Velocity.init();

		VelocityContext context = new VelocityContext();

		Map<String, String> map = new HashMap<>();
		map.put("innerMapKey", "This is value from inner map");

		context.put("parentKey", map);

		Template t = Velocity.getTemplate("innermapcontext.vm");

		StringWriter writer = new StringWriter();
		t.merge(context, writer);

		System.out.println(writer.toString());
	}

}

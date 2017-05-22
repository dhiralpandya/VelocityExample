package com.omt.velocity.example;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

public class ExampleOneMain {

	public static void main(String[] args) {
		templateWithinVelocity();
	}

	private static void singletonCreation() {
		Velocity.init();

		VelocityContext context = new VelocityContext();
		context.put("siteName", "omtlab.com");
		context.put("visitorPerPage", "7777");
		context.put("sample", "Singleton");

		Template t = Velocity.getTemplate("example.vm");
		StringWriter sw = new StringWriter();

		t.merge(context, sw);

		System.out.println(sw.toString());

	}

	private static void multipleObjects() {
		VelocityEngine ve = new VelocityEngine();
		ve.init();

		VelocityContext context = new VelocityContext();
		context.put("siteName", "omtlab.com");
		context.put("visitorPerPage", "7777");
		context.put("sample", "Multiple Objects");

		Template t = ve.getTemplate("example.vm");
		StringWriter sw = new StringWriter();

		t.merge(context, sw);

		System.out.println(sw.toString());

	}

	private static void templateWithinVelocity() {
		Velocity.init();

		VelocityContext context = new VelocityContext();
		context.put("siteName", "omtlab.com");
		context.put("visitorPerPage", "7777");
		context.put("sample", "Template Within Velocity");

		StringWriter sw = new StringWriter();
		Velocity.mergeTemplate("example.vm", context, sw);
		System.out.println(sw.toString());

	}

}

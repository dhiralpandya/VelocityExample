package com.omt.velocity.example;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class IncluseParseVelocity {

	public IncluseParseVelocity() {

	}

	public static void main(String[] args) {
		includeExample();
	}

	private static void parseExample() {
		Velocity.init();

		VelocityContext context = new VelocityContext();
		context.put("headerText", "This is header");
		context.put("footerText", "This is footer");
		context.put("contentText", "This is content");

		Template t = Velocity.getTemplate("content.vm");
		StringWriter writer = new StringWriter();
		t.merge(context, writer);

		System.out.println(writer.toString());
	}

	private static void includeExample() {
		Velocity.init();

		Template t = Velocity.getTemplate("includeexample.vm");
		StringWriter writer = new StringWriter();
		t.merge(null, writer);

		System.out.println(writer.toString());
	}

}

package com.omt.velocity.example;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class SetExample {

	public SetExample() {

	}

	public static void main(String... args) {
		setExample();
	}

	public static void setExample() {

		Velocity.init();

		VelocityContext context = new VelocityContext();
		context.put("someValue", "This is from java code");

		Template t = Velocity.getTemplate("set.vm");

		StringWriter sw = new StringWriter();
		t.merge(context, sw);

		System.out.println(sw.toString());

	}

}

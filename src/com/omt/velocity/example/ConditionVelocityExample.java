package com.omt.velocity.example;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class ConditionVelocityExample {

	public static void main(String[] args) {

		Velocity.init();

		VelocityContext context = new VelocityContext();
		context.put("i", 0);

		Template t = Velocity.getTemplate("condition.vm");

		StringWriter sw = new StringWriter();

		t.merge(context, sw);

		System.out.println(sw.toString());

	}

}

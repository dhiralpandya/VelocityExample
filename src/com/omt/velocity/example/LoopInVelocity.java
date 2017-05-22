package com.omt.velocity.example;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class LoopInVelocity {

	public LoopInVelocity() {

	}

	public static void main(String args[]) {
		List<String> sites = new ArrayList<>();

		sites.add("omtlab.com");
		sites.add("google.com");
		sites.add("facebook.com");
		sites.add("apple.com");

		loopInVelocity(sites);
	}

	private static void loopInVelocity(List<String> sites) {

		Velocity.init();

		VelocityContext context = new VelocityContext();
		context.put("sites", sites);

		Template t = Velocity.getTemplate("loop.vm");

		StringWriter sw = new StringWriter();

		t.merge(context, sw);

		System.out.println(sw.toString());

	}

}

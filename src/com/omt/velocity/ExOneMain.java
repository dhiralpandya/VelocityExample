package com.omt.velocity;

import org.apache.velocity.app.Velocity;

public class ExOneMain {

	public ExOneMain() {

	}

	public static void main(String[] args) {

		Velocity.init();

		Customer c = new Customer();
		// c.name = "Dhiral Pandya";
		// c.company = "omtlab";
		//
		// Map<String, String> hashMap = new HashMap<>();
		//
		// hashMap.put("name", c.name);
		// hashMap.put("company", c.company);
		//
		// VelocityContext context = new VelocityContext();
		// context.put("omtdata", "omt om sairam");
		// context.put("customer", hashMap);
		// context.put("cus", c);
		//
		// List<String> list = new ArrayList();
		// list.add("omt1");
		// list.add("omt2");
		// context.put("names", list.iterator());
		//
		// StringWriter sw = new StringWriter();
		//
		// Velocity.mergeTemplate("omt.vm", context, sw);
		//
		// System.out.println(sw.toString());

	}

}

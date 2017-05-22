package com.omt.velocity.example;

import java.util.Properties;

import org.apache.commons.collections.ExtendedProperties;
import org.apache.velocity.app.Velocity;

public class PropertiesVelocity {

	public static void main(String[] args) {
		// accessDefaultProperties();
		modifyDefaultProperties();
	}

	private static void accessDefaultProperties() {

		Velocity.init();
		// Access Default Properties
		System.out.println(Velocity.getProperty("file.resource.loader.description"));

	}

	private static void modifyDefaultProperties() {
		Properties p = new Properties();
		p.setProperty("file.resource.loader.description", "This is omtlab value for default properties");

		Velocity.init(p);
		// Change value of default Properties
		System.out.println(Velocity.getProperty("file.resource.loader.description"));

	}

	private static void addAdditionalProperties() {
		// To add additional properties you have to use apache
		// ExtendedProperties class.
		ExtendedProperties ep = new ExtendedProperties();
		ep.addProperty("com.omtlab.newprop", "This is new additional property");

		// 1. Add ExtendedProperties object
		Velocity.setExtendedProperties(ep);

		// 2. Now call init method.
		Velocity.init();

		System.out.println(Velocity.getProperty("com.omtlab.newprop"));

	}

}

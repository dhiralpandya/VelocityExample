package com.omt.velocity.example;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.app.Velocity;

public class CommentsVelocity {

	public CommentsVelocity() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Velocity.init();

		Template t = Velocity.getTemplate("comments.vm");

		StringWriter writer = new StringWriter();
		t.merge(null, writer);

		System.out.println(writer.toString());

	}

}

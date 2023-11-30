package com.spring_applicationcontext;

import org.springframework.stereotype.Component;

@Component
public class TubeLight {
	public TubeLight() {
		System.out.println("tubelight");
	}
	public void m1() {
		System.out.println("working..................");
	}
}

package com.javaex.ex2;

public class Circle {

	//필드
	private int radius;

	//생성자
	public Circle() {}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	//메소드
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	//메소드
	public void draw() {
		System.out.println("원(반지름:"+ radius +")을 그렸습니다.");
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}

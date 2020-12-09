package com.javaex.ex3;

public class Triangle {

	//필드
	private int width;
	private int height;
	
	
	//생성자
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//메소드 g/s
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	//메소드
	public void draw() {
		System.out.println("삼각형(가로+"+ width + ", 세로:" + height +"을 그렸습니다.)");
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	
}

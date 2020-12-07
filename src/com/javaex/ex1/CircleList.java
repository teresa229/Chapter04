package com.javaex.ex1;

public class CircleList {
	
	//필드
	private Circle[] cArray;
	private int crtPos;
	
	//생성자
	public CircleList() {
		cArray = new Circle[3];
		crtPos = 0;
	}

	//메소드
	public void add(Circle c) {
		cArray[crtPos] = c;
		crtPos++;
	}
	public Circle get(int index) {
		return cArray[index];
	}
	
	public int size() {
		return crtPos;
	}


}

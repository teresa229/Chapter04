package com.javaex.ex1;

public class RectList {

	//필드
	private Rectangle[] rArray;
	private int crtPos;
	
	//생성자
	public RectList() {
		rArray = new Rectangle[3];
		crtPos = 0;
	}
	
	//메소드
	public void add(Rectangle r) { //r은 주소값을 넣어준다.
		rArray[crtPos] = r;//crtPos 사용자가 넣은 값
		crtPos++;
	}

	public Rectangle get(int index) {
		return rArray[index];
	}
	
	public int size() {
		return crtPos;
	}
}

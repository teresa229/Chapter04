package com.javaex.ex3;

public class ListApp3 {

	public static void main(String[] args) {
		
		//사각형 관리   //범용 ﻿object 사용     //메모리에 올릴 때 (new)사각형 용으로 만들어 버린다.
		MyList<Rectangle> rList = new MyList<Rectangle>();
		
		Rectangle r01 = new Rectangle(5,5);
		Rectangle r02 = new Rectangle(10,10);
		
		rList.add(r01);
		rList.add(r02); 
		
		//원 관리
		MyList<Circle> cList = new MyList<Circle>();
	
		Circle c01 = new Circle(7);
		Circle c02 = new Circle(10);
		
		cList.add(c01);
		cList.add(c02);
		
		//삼각형 관리
		MyList<Triangle> tList = new MyList<Triangle>();
		
		Triangle t01 = new Triangle(7,10);
		Triangle t02 = new Triangle(10,10);
		
		tList.add(t01);
		tList.add(t02);
	}

}

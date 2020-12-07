package com.javaex.ex1;

public class ListApp {
	
	public static void main(String[] args) {
		//사각형은 사각형끼리
		//원은 원끼리
		//삼각형은 삼각형끼리
		
		//사각형 관리
		RectList rList = new RectList();
		
		Rectangle r01 = new Rectangle(3,9);
		Rectangle r02 = new Rectangle(10,10);
		
		rList.add(r01); //r01 Ox123 들어감
		rList.add(r02); //r02 Ox333들어감.  rArray[]배열값으로 보고 싶어도 볼수 없다. 접근할 수 있는 것을 만들어 준다.
		
		//원 관리
		CircleList cList = new CircleList();
		
		Circle c01 = new Circle(4);
		Circle c02 = new Circle(6);
		
		cList.add(c01);
		cList.add(c02);
		
		//삼각형 관리
		TriangleList tList = new TriangleList();
		
		Triangle t01 = new Triangle(3,9);
		Triangle t02 = new Triangle(10,10);
		
		tList.add(t01);
		tList.add(t02);
		
	}
}

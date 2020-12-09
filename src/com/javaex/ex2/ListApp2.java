package com.javaex.ex2;

public class ListApp2 {

	public static void main(String[] args) {
		
		//objList 클래스를 3번 사용(각각의 리스트 사용하지 않는다.)

		//사각형 관리
		Rectangle r01 = new Rectangle(3,3);
		Rectangle r02 = new Rectangle(5,10);
		
		ObjList rList = new ObjList();
		
		rList.add(r01);
		rList.add(r02);
		
		for(int i=0; i<rList.size(); i++) {
			((Rectangle)(rList.get(i))).draw();
		}
		
		//원 관리
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);
		
		ObjList cList = new ObjList();
		cList.add(c01);
		cList.add(c02);
		
		for(int i=0; i<cList.size(); i++) {
			((Circle)(cList.get(i))).draw();
		}
		
		//삼각형 관리
		Triangle t01 = new Triangle(5,10);
		Triangle t02 = new Triangle(10,10);
		
		ObjList tList = new ObjList();
		
		tList.add(t01);
		tList.add(t02);
		
		for(int i=0; i<tList.size(); i++) {
			((Triangle)(tList.get(i))).draw();
		}
		
		
	}
		

}

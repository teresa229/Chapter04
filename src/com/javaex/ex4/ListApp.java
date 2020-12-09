package com.javaex.ex4;

import java.util.ArrayList; //불러오기
import java.util.LinkedList;

public class ListApp {
	
	public static void main(String[] args) {
		
			//ArrayList
			ArrayList<Rectangle> rList = new ArrayList<Rectangle>(); //control + shift + o
			
			Rectangle r01 = new Rectangle(3,3);
			Rectangle r02 = new Rectangle(4,4);
			Rectangle r03 = new Rectangle(10,10);
			
			//add()
			rList.add(r01);
			rList.add(r02);
			rList.add(r03);
			
			//get()
			Rectangle r = rList.get(0);            //﻿주소만 주었다. rList.get(0);  //r로 값을 불러온다.
			System.out.println(r.getWidth());
			System.out.println(r.getHeight());
			r.draw();
			System.out.println(r.toString());
			
			//size()
			System.out.println(rList.size());
			
			
			Rectangle r04 = new Rectangle(100,100);
			//위치지정 추가
			rList.add(2, r04);
			
			System.out.println("================");
			
			//전체 출력
			for(int i=0; i<rList.size(); i++) {    //개수를 알아야 돌리지
				rList.get(i).draw();
			}	
			
			System.out.println("================");
			
			//삭제 remove()  방법 1
			rList.remove(0);
			
			//전체 출력
			for(int i=0; i<rList.size(); i++) {    //개수를 알아야 돌리지
				rList.get(i).draw();
			}	
			
			System.out.println("================");
			//삭제 remove()  방법 2
			rList.remove(r03);
			
			//전체 출력
			for(int i=0; i<rList.size(); i++) {
				rList.get(i).draw();			
			}	
			
			System.out.println("=원관리============");
			////원
	//		ArrayList<Circle> cList = new ArrayList<Circle>();
			LinkedList<Circle> cList = new LinkedList<Circle>();
			
			Circle c01 = new Circle(5);
			Circle c02 = new Circle(500);
			
			cList.add(c01);
			cList.add(c02);
			
			for(int i=0; i<cList.size(); i++) {
				cList.get(i).draw();
			}
		
	}
		
}



package com.javaex.ex2;

public class ObjList {

		//필드
		private Object[] oArray;
		private int crtPos;
		
		//생성자
		public ObjList() {
			oArray = new Object[3];
			crtPos = 0;
		}
		
		//메소드
		public void add(Object o) { //r은 주소값을 넣어준다.
			oArray[crtPos] = o;     //crtPos 사용자가 넣은 값
			crtPos++;
		}

		public Object get(int index) {
			return oArray[index];
		}
		
		public int size() {
			return crtPos;
		}
	
}

package com.javaex.ex3;

public class MyList<T> { //대문자 하나만 적어준다. 변수같은 개념.

    //필드
	private T[] oArray;
	private int crtPos;
	
	//생성자
	public MyList() {
		oArray = (T[])(new Object[3]); //Circle,rectangle로 바뀌치기 해달라고 T
		crtPos = 0;                    //자료형 바꾸듯이~
	}
	
	//메소드
	public void add(T o) {     //o은 주소값을 넣어준다.
		oArray[crtPos] = o;    //crtPos 사용자가 넣은 값
				crtPos++;
	}

	public T get(int index) {
		return oArray[index];
	}
	
	public int size() {
		return crtPos;
	}	
}

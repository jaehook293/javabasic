package ch06;

import java.util.ArrayList;
import java.util.Iterator;

class 백조{}

public class CollectionEx01 {

	public static void main(String[] args) {
		// int, double, char, boolean -> 기본자료형 (값)
		// String, 커스텀자료형(클래스) -> 레퍼런스 자료형 (주소)
		// 래핑클래스 = Integer, Double, Character, Boolean
		ArrayList<Integer> c1 = new ArrayList<>();
		
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		
//		System.out.println(c1.get(0));
		
		// for문
		int size = c1.size();
		System.out.println("길이:" + size);
		for (int i = 0; i < c1.size(); i++) {
			System.out.println(c1.get(i));
		}
		
		
	}

}

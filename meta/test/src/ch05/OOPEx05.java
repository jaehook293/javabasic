package ch05;

class 전사{ // 검
	String name="전사";
	
	void 기본공격(궁수 e1) {
		System.out.println("검으로 "+ e1.name + " 공격하기");
	}
	
	void 기본공격(광전사 e1) {
		System.out.println("검으로 "+ e1.name + " 공격하기");
	}
}

class 궁수{ // 활
	String name="궁수";
	void 기본공격(광전사 e1) {
	System.out.println("활로 " +e1.name+" 공격하기");
	}
}

class 광전사{ // 도끼
	String name="광전사";
	void 기본공격(전사 e1) {
		System.out.println("도끼로 "+e1.name+" 공격하기");
		}
}
	
class 마법사{ // 마법
	String name="마법사";
	void 기본공격(전사 e1) {
		System.out.println("마법으로 "+e1.name+" 공격하기");
		}
}
		
class 흑마법사{ // 도끼
	String name="흑마법사";
	void 기본공격(전사 e1) {
		System.out.println("흑마법으로 "+e1.name+" 공격하기");
		}		
}

	// 유닛이 100개라면 기본공격 메서드가 100개가 되어야 한다. 엄청난 단점
	// 오버로딩은 어느 정도 경우의 수 제한이 있다면 좋다. 하지만 경우의 수가 많다면 힘들다.

public class OOPEx05 {
	
	public static void main(String[] args) {
		전사 u1 = new 전사();
		궁수 u2 = new 궁수();
		광전사 u3 = new 광전사();
		
		
		// 기억해야 할 메서드이름이 기본공격() 하나뿐이라 편함.
		u1.기본공격(u2);
		u2.기본공격(u3);
		u3.기본공격(u1);
		u1.기본공격(u3);
	}

}
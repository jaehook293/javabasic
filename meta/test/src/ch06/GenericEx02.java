package ch06;

class ȣ���� {
	String name = "ȣ����";
}

class ���� {
	String name = "����";
}


// ȣ����, ����
class ū�ٱ���<T>{
	T data;
}

public class GenericEx02 {

	public static void main(String[] args) {
		ū�ٱ���<ȣ����> s1 = new ū�ٱ���<>();
		s1.data = new ȣ����();
		System.out.println(s1.data.name);
		
		ū�ٱ���<����> s2 = new ū�ٱ���<>();
		s2.data = new ����();
		System.out.println(s2.data.name);
		
	}

}
package ch05;


// �丮��
class �丮�� {
	String name = "�丮��";
}


// ȫ�浿 or �丮��
class ȫ�浿 extends �丮��{
	String name = "ȫ�浿";
}

public class OOPEx03 {

	public static void main(String[] args) {
		ȫ�浿 h1 = new ȫ�浿(); // (ȫ�浿, �丮��)
		System.out.println(h1.name);
		
		�丮�� y1 = new ȫ�浿(); // (ȫ�浿, �丮��)
		System.out.println(y1.name);
		
		// ȫ�浿 h2 = new �丮��(); // (�丮��)
	}
}

package polymorphism.typecasting2;

public class ChildExam {

	public static void main(String[] args) {
		Parent parent = new Child(); //자동 타입변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

//		parent.field2 = "data2";
//		parent.method3();
		
		Child child = (Child) parent; //강제 타입변환
		child.field2 = "data2";
		child.method3();
	}

}

package Array;

public class ArrayCreateExam {

	public static void main(String[] args) {
		
		int[] arr1 = new int[3];
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
	}
}

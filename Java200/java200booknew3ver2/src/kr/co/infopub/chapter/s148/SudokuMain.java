package kr.co.infopub.chapter.s148;
public class SudokuMain {
	public static void main(String[] args) {
		Sudoku sd=new Sudoku(3);
		sd.setShuffle(false);    // 섞지 말고 보인다.
		//sd.setShuffle(true);    // 섞는다.
		sd.init();
		sd.shuffle();
		sd.print();
	}
}

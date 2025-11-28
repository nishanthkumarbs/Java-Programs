package patterns;

/*

Pattern:-10

ABCDE
FGHIJ
KLMNO
PQRST
UVWXY


*/

public class p10 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		char ch = 'A';
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(ch++);
			}
			System.out.println();
			
		}
	}
}

package patterns;

/*

Pattern:-2

ABCDE
ABCDE
ABCDE
ABCDE

*/

public class p2 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for (int i = 0; i < row; i++) {
			char ch = 'A';
			for (int j = 0; j < col; j++) {
				System.out.print(ch++);
				
			}
			System.out.println();
		}
	}

}


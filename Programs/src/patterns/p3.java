package patterns;

/*

Pattern:-3

EDCBA
EDCBA
EDCBA
EDCBA

*/

public class p3 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for (int i = 0; i < row; i++) {
			char ch = 'E';
			for (int j = 0; j < col; j++) {
				System.out.print(ch--);
				
			}
			System.out.println();
		}
	}

}


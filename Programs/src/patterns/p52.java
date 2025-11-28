package patterns;

/*

Pattern:-52

    E
   DE
  CDE
 BCDE
ABCDE

*/

public class p52 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for (int i = 0; i < row; i++) {
			char ch = (char) ('E'-i);
			for (int j = 0; j < col; j++) {
				if (i+j>=row-1) {
					System.out.print(ch++);
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}

package patterns;

/*

Pattern:-63

    5
   54
  543
 5432
54321

*/

public class p63 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for (int i = 0; i < row; i++) {
			int num = 5;
			for (int j = 0; j < col; j++) {
				if (i+j>=row-1) {
					System.out.print(num--);
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
			
		}
	}

}

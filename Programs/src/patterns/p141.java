package patterns;

/*

Pattern:-141

* * *
 *** 
*****
 *** 
* * *

*/

public class p141 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if ( i==row/2 || j==col/2 || i==j || i+j==row-1) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
			
		}
	}
}

package patterns;

/*

Pattern:-132

   *
  **
 ***
****
 ***
  **
   *

*/

public class p132 {
	public static void main(String[] args) {
		int row = 7;
		int no_char = 1;
		int no_space = row/2;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) { 
				System.out.print('*');
			}
			System.out.println();
			if (i<row/2) {
				no_char++;
				no_space--;
			} else {
				no_char--;
				no_space++;
			}
		}
	}
}

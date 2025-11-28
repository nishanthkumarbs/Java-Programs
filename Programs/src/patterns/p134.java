package patterns;

/*

Pattern:-134

*      *
**    **
***  ***
********
***  ***
**    **
*      *

*/

public class p134 {
	public static void main(String[] args) {
		int row = 7;
		int no_char = 2;
		int no_space = row-1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < no_char/2; j++) {
				System.out.print('*');
			}
			for (int k = 0; k < no_space; k++) { 
				System.out.print(' ');
			}
			for (int l = 0; l < no_char/2; l++) {
				System.out.print('*');
			}
			System.out.println();
			if (i<row/2) {
				no_space-=2;
				no_char+=2;
			} else {
				no_space+=2;
				no_char-=2;
			}
		}
	}
}

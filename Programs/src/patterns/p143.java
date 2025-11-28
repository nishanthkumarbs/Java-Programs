package patterns;

/*

Pattern:-143

*******
 *   *
  * *
   *
  * *
 *   *
*******

*/

public class p143 {
	public static void main(String[] args) {
		int row = 7;
		int no_char = row;
		int no_space = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) {
				if (k==0 || k==no_char-1 || i==0 || i==row-1) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
			if (i<row/2) {
				no_char-=2;
				no_space++;
			} else {
				no_char+=2;
				no_space--;
			}
		}
	}

}

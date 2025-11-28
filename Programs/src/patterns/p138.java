package patterns;

/*

Pattern:-138

    *
   * *
  *   *
 *     *
*********

*/

public class p138 {
	public static void main(String[] args) {
		int row = 5;
		int no_char = 1;
		int no_space = row-1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) {
				if (k==0 || k==no_char-1 || i==row-1) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
			no_char+=2;
			no_space--;
		}
	}

}

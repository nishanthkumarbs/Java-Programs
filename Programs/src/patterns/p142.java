package patterns;

/*

Pattern:-142

*******
 *   *
  * *
   *

*/

public class p142 {
	public static void main(String[] args) {
		int row = 4;
		int no_char = 2*row-1;
		int no_space = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) {
				if (k==0 || k==no_char-1 || i==0) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
			no_char-=2;
			no_space++;
		}
	}

}

package patterns;

/*

Pattern:-104

*********
 *******
  *****
   ***
    *

*/

public class p104 {
	public static void main(String[] args) {
		int row = 5;
		int no_char = 2*row-1;
		int no_space = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) {
				System.out.print('*');
			}
			System.out.println();
			no_char-=2;
			no_space++;
		}
	}

}

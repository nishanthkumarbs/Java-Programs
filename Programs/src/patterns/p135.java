package patterns;

/*

Pattern:-135

   ****
  ****
 ****
****

*/

public class p135 {
	public static void main(String[] args) {
		int row = 4;
		int no_char = 4;
		int no_space = row-1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) { 
				System.out.print('*');
			}
			System.out.println();
			no_space--;
		}
	}
}

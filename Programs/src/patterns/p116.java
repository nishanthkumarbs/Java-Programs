package patterns;

/*

Pattern:-116

101010101
 1010101
  10101
   101
    1

*/

public class p116 {
	public static void main(String[] args) {
		int row = 5;
		int no_char = 2*row-1;
		int no_space = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) {
				System.out.print((k+1)%2); 
			}
			System.out.println();
			no_char-=2;
			no_space++;
		}
	}
}

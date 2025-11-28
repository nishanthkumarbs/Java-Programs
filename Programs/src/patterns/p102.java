package patterns;

/*

Pattern:-102

    1
   010
  10101
 0101010
101010101

*/

public class p102 {
	public static void main(String[] args) {
		int row = 5;
		int no_char = 1;
		int no_space = row-1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) {
				System.out.print((i+k+1)%2); 
			}
			System.out.println();
			no_char+=2;
			no_space--;
		}
	}
}

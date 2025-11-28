package patterns;

/*

Pattern:-101

    1
   101
  10101
 1010101
101010101

*/

public class p101 {
	public static void main(String[] args) {
		int row = 5;
		int no_char = 1;
		int no_space = row-1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) {
				System.out.print((k+1)%2); 
			}
			System.out.println();
			no_char+=2;
			no_space--;
		}
	}
}

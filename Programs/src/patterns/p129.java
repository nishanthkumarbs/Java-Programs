package patterns;

/*

Pattern:-129

   1
  010
 10101
0101010
 10101
  010
   1

*/

public class p129 {
	public static void main(String[] args) {
		int row = 7;
		int no_char = 1;
		int no_space = row/2;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) { 
				System.out.print((i+k+1)%2);
			}
			System.out.println();
			if (i<row/2) {
				no_char+=2;
				no_space--;
			} else {
				no_char-=2;
				no_space++;
			}
		}
	}
}

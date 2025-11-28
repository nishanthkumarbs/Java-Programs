package patterns;

/*

Pattern:-130

   1
  000
 11111
0000000
 11111
  000
   1

*/

public class p130 {
	public static void main(String[] args) {
		int row = 7;
		int no_char = 1;
		int no_space = row/2;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) { 
				System.out.print((i+1)%2);
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

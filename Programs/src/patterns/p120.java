package patterns;

/*

Pattern:-120

   A
  BBB
 CCCCC
DDDDDDD
 CCCCC
  BBB
   A

*/

public class p120 {
	public static void main(String[] args) {
		int row = 7;
		int no_char = 1;
		int no_space = row/2;
		char ch = 'A';
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < no_space; j++) {
				
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) {
				System.out.print(ch); 
			}
			System.out.println();
			if (i<row/2) {
				no_char+=2;
				no_space--;
				ch++;
			} else {
				no_char-=2;
				no_space++;
				ch--;
			}
		}
	}
}

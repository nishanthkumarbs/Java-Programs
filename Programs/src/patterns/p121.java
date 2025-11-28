package patterns;

/*

Pattern:-121

   D
  CCC
 BBBBB
AAAAAAA
 BBBBB
  CCC
   D

*/

public class p121 {
	public static void main(String[] args) {
		int row = 7;
		int no_char = 1;
		int no_space = row/2;
		char ch = 'D';
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
				ch--;
			} else {
				no_char-=2;
				no_space++;
				ch++;
			}
		}
	}
}

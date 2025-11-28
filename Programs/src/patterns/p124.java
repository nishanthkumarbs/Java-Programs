package patterns;

/*

Pattern:-124

   A
  BAB
 CBABC
DCBABCD
 CBABC
  BAB
   A

*/

public class p124 {
	public static void main(String[] args) {
		int row = 7;
		int no_char = 1;
		int no_space = row/2;
		for (int i = 0; i < row; i++) {
			char ch = (char)('A'+no_char/2);
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) { 
				if (k<no_char/2) {
					System.out.print(ch--);
				} else {
					System.out.print(ch++);
				}
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

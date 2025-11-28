package patterns;

/*

Pattern:-112

EDCBABCDE
 DCBABCD
  CBABC
   BAB
    A

*/

public class p112 {
	public static void main(String[] args) {
		int row = 5;
		int no_char = 2*row-1;
		int no_space = 0;
		
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
			no_char-=2;
			no_space++;
		}
	}
}

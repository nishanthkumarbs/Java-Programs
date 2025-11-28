package patterns;

/*

Pattern:-111

ABCDEDCBA
 ABCDCBA
  ABCBA
   ABA
    A

*/

public class p111 {
	public static void main(String[] args) {
		int row = 5;
		int no_char = 2*row-1;
		int no_space = 0;
		
		for (int i = 0; i < row; i++) {
			char ch = 'A';
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) {
				if (k<no_char/2) {
					System.out.print(ch++);
				} else {
					System.out.print(ch--);
				}
			}
			System.out.println();
			no_char-=2;
			no_space++;
		}
	}
}

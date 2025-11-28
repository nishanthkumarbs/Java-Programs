package patterns;

/*

Pattern:-115

IHGFEDCBA
 GFEDCBA
  EDCBA
   CBA
    A

*/

public class p115 {
	public static void main(String[] args) {
		int row = 5;
		int no_char = 2*row-1;
		int no_space = 0;
		for (int i = 0; i < row; i++) {
			char ch = (char)('I'-(2*i));
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) {
				System.out.print(ch--);
			}
			System.out.println();
			no_char-=2;
			no_space++;
		}
	}
}

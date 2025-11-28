package patterns;

/*

Pattern:-94

    A
   CBA
  EDCBA
 GFEDCBA
IHGFEDCBA

*/

public class p94 {
	public static void main(String[] args) {
		int row = 5;
		int no_char = 1;
		int no_space = row-1;
		for (int i = 0; i < row; i++) {
			char ch = (char)('A'+no_char-1);
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) {
				System.out.print(ch--);
			}
			System.out.println();
			no_char+=2;
			no_space--;
		}
	}

}

package patterns;

/*

Pattern:-88

    A
   BBB
  CCCCC
 DDDDDDD
EEEEEEEEE

*/

public class p88 {
	public static void main(String[] args) {
		int row = 5;
		int no_char = 1;
		int no_space = row-1;
		char ch = 'A';
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) {
				System.out.print(ch);
			}
			System.out.println();
			no_char+=2;
			no_space--;
			ch++;
		}
	}

}

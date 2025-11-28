package patterns;

/*

Pattern:-106

111111111
 2222222
  33333
   444
    5

*/

public class p106 {
	public static void main(String[] args) {
		int row = 5;
		int no_char = 2*row-1;
		int no_space = 0;
		int num =1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) {
				System.out.print(num);
			}
			System.out.println();
			no_char-=2;
			no_space++;
			num++;
		}
	}

}

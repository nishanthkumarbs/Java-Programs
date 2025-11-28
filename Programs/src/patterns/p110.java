package patterns;

/*

Pattern:-110

555555555
 4444444
  33333
   222
    1

*/

public class p110 {
	public static void main(String[] args) {
		int row = 5;
		int no_char = 2*row-1;
		int no_space = 0;
		int num = 5;
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
			num--;
		}
	}

}

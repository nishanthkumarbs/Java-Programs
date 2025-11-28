package patterns;

/*

Pattern:-91

    5
   444
  33333
 2222222
111111111

*/

public class p91 {
	public static void main(String[] args) {
		int row = 5;
		int no_char = 1;
		int no_space = row-1;
		int num = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) {
				System.out.print(num);
			}
			System.out.println();
			no_char+=2;
			no_space--;
			num--;
		}
	}

}

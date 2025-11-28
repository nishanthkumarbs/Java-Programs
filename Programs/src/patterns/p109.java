package patterns;

/*

Pattern:-109

123456789
 1234567
  12345
   123
    1

*/

public class p109 {
	public static void main(String[] args) {
		int row = 5;
		int no_char = 2*row-1;
		int no_space = 0;
		for (int i = 0; i < row; i++) {
			int num = 1;
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) {
				System.out.print(num++);
			}
			System.out.println();
			no_char-=2;
			no_space++;
			
		}
	}

}

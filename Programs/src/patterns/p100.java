package patterns;

/*

Pattern:-100

    A
   ABA
  ABCAB
 ABCDABC
ABCDEABCD

*/

public class p100 {
	public static void main(String[] args) {
		int row = 5;
		int no_char = 1;
		int no_space = row-1;
		for (int i = 0; i < row; i++) {
			char ch = 'A';
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) {
				System.out.print(ch++);
				if (k==no_char/2) {
					ch='A';
				} 
			}
			System.out.println();
			no_char+=2;
			no_space--;
		}
	}
}

package patterns;

/*

Pattern:-118

111111111
 0000000
  11111
   000
    1

*/

public class p118 {
	public static void main(String[] args) {
		int row = 5;
		int no_char = 2*row-1;
		int no_space = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < no_space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) {
				System.out.print((i+1)%2); 
			}
			System.out.println();
			no_char-=2;
			no_space++;
		}
	}
}

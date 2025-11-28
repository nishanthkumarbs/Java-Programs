package patterns;

/*

Pattern:-122

   1
  222
 33333
4444444
 33333
  222
   1

*/

public class p122 {
	public static void main(String[] args) {
		int row = 7;
		int no_char = 1;
		int no_space = row/2;
		int num = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < no_space; j++) {
				
				System.out.print(' ');
			}
			for (int k = 0; k < no_char; k++) {
				System.out.print(num); 
			}
			System.out.println();
			if (i<row/2) {
				no_char+=2;
				no_space--;
				num++;
			} else {
				no_char-=2;
				no_space++;
				num--;
			}
		}
	}
}

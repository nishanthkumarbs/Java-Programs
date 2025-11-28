package patterns;

/*

Pattern:-133

*
**
***
****
***
**
*

*/

public class p133 {
	public static void main(String[] args) {
		int row = 7;
		int no_char = 1;
		for (int i = 0; i < row; i++) {
			for (int k = 0; k < no_char; k++) { 
				System.out.print('*');
			}
			System.out.println();
			if (i<row/2) {
				no_char++;
			} else {
				no_char--;
			}
		}
	}
}

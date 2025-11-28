package patterns;

/*

Pattern:-59

    5
   44
  333
 2222
11111

*/

public class p59 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		int num = 5;
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < col; j++) {
				if (i+j>=row-1) {
					System.out.print(num);
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
			num--;
		}
	}

}

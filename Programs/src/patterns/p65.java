package patterns;

/*

Pattern:-65

    1
   23
  456
 7891
23456

*/

public class p65 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		int num = 1;
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < col; j++) {
				if (num==10) {
					num=1;
				}
				if (i+j>=row-1) {
					System.out.print(num++);
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
			
		}
	}

}

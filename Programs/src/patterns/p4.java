package patterns;

/*

Pattern:-4

12345
12345
12345
12345

*/

public class p4 {

	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for (int i = 0; i < row; i++) {
			int num = 1;
			for (int j = 0; j < col; j++) {
				System.out.print(num++);
				
			}
			System.out.println();
		}
	}
}

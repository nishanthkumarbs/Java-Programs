package patterns;

/*

Pattern:-11

12345
67891
23456
78912
34567


*/

public class p11 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		int num = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(num++);
				if (num==10) {
					num = 1;
				}
			}
			System.out.println();
		}
	}
}

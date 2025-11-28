package patterns;

/*

Pattern:-13

11111
00000
11111
00000
11111



*/

public class p13 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print((i+1)%2);
			}
			System.out.println();
		}
	}
}

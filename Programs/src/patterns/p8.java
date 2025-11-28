package patterns;

/*

Pattern:-8

11111
22222
33333
44444
55555


*/

public class p8 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		int num = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(num);
			}
			System.out.println();
			num++;
		}
	}
}

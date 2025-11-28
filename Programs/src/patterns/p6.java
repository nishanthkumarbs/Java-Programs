package patterns;

/*

Pattern:-6

AAAAAA
BBBBBB
CCCCCC
DDDDDD
EEEEEE

*/

public class p6 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		char ch = 'A';
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < col; j++) {
				System.out.print(ch);
			}
			System.out.println();
			ch++;
		}
	}
}

package patterns;

/*

Pattern:-70

AAAAA
BBBB 
CCC  
DD   
E    

*/

public class p70 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		char ch = 'A';
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < col; j++) {
				if (i+j<=row-1) {
					System.out.print(ch);
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
			ch++;
		}
	}

}

package patterns;

/*

Pattern:-75

EDCBA
EDCB 
EDC  
ED   
E    

*/

public class p75 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for (int i = 0; i < row; i++) {
			char ch = 'E';
			for (int j = 0; j < col; j++) {
				if (i+j<=row-1) {
					System.out.print(ch--);
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}

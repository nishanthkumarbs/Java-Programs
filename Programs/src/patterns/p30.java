package patterns;

/*

Pattern:-30

1    
01   
101  
0101 
10101

*/

public class p30 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i>=j) {
					System.out.print((i+j+1)%2);
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}

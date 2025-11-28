package patterns;

/*

Pattern:-18

1    
12   
123  
1234 
12345

*/

public class p18 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for (int i = 0; i < row; i++) {
			int num = 1;
			for (int j = 0; j < col; j++) {
				if (i>=j) {
					System.out.print(num++);
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}

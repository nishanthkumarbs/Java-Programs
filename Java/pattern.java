 class pattern {
    public static void main(String[] args) {
        int rows = 5;  
        int cols = 3; 

        for (int i = 1; i <= rows; i++) {
            if (i % 2 == 1) { 
                for (int j = 1; j <= cols; j++) {
                    System.out.print("* ");
                }
            } 
			else { 
                System.out.print("*");
                for (int j = 1; j <= (cols - 2); j++) {
                    System.out.print("   ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

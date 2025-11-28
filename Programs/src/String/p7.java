package String;

/* Write a program to find the largest word in a sentence */

public class p7 {
	public static void main(String[] args) {
		String s = "Arnold is the Best BodyBuilder";
		String[] x = s.split(" ");
		String largest = "";
		
		for (int i = 0; i < x.length; i++) {
            if (x[i].length() > largest.length()) {
                largest = x[i];
            }
        }

        System.out.println("Sentence: " + s);
        System.out.println("Largest word: " + largest);
	}

}

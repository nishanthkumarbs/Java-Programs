package exception;

import java.io.File;
import java.io.IOException;

public class p14 {
	public static void main(String[] args) throws ClassNotFoundException, InterruptedException, IOException {
		Class.forName("abc");
		Thread.sleep(1000);
		File.createTempFile(null, null);
	}

}

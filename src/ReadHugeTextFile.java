import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class ReadHugeTextFile {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		Scanner scanner = new Scanner(new File("/Users/feroz/Downloads/catalina.out"));
		String sum = "";
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		// sum += scanner.nextLine();
		scanner.close();
		System.out.println("Time taken by scanner: " + (System.currentTimeMillis() - start));
		start = System.currentTimeMillis();
		Reader in = new FileReader(new File("/Users/feroz/Downloads/catalina.out"));
		sum = "";
		BufferedReader bi = new BufferedReader(in);
		String line;
		while ((line = bi.readLine()) != null)
			// sum += line;
			bi.close();
		System.out.println("Time taken by bufferedReader: " + (System.currentTimeMillis() - start));
	}
}

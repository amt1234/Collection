package regularexpresssion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintFileInput {

	public static void main(String[] args) throws IOException {
		PrintWriter printWriter = new PrintWriter("output.txt");
		Pattern pattern = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
		String line = bufferedReader.readLine();

		while (line != null) {
			Matcher matcher=pattern.matcher(line);
			while(matcher.find())
			{
				
				System.out.println(matcher.group());
			}
			line=bufferedReader.readLine();
		}
		printWriter.flush();
	}

}

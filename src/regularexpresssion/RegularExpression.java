package regularexpresssion;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		int count=0;
		Pattern p=Pattern.compile("a");
		Matcher m=p.matcher("abaabbaaab");
		while(m.find())
		{
			count++;
			System.out.println(m.start()+"----"+m.end()+"----"+m.group());
		}
		System.out.println("Total number of occurances :"+count);
	}

}

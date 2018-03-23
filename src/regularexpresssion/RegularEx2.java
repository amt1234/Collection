package regularexpresssion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx2 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[abc]");
		Matcher m=p.matcher("a1b7@z#");
		while(m.find())
		{
			System.out.println(m.start()+"-----"+m.group());
		}
		System.out.println();
		
		Pattern p1=Pattern.compile("[^abc]");
		Matcher m1=p1.matcher("a1b7@z#");
		while(m1.find())
		{
			System.out.println(m1.start()+"-----"+m1.group());
		}
		System.out.println();
		
		Pattern p2=Pattern.compile("[a-z]");
		Matcher m2=p2.matcher("a1b7@z#D");
		while(m2.find())
		{
			System.out.println(m2.start()+"-----"+m2.group());
		}
		System.out.println();
		
		Pattern p3=Pattern.compile("[A-Z]");
		Matcher m3=p3.matcher("a1b7@z#D");
		while(m3.find())
		{
			System.out.println(m3.start()+"-----"+m3.group());
		}
		System.out.println();
		
		Pattern p4=Pattern.compile("[0-9]");
		Matcher m4=p4.matcher("a1b7@z#D");
		while(m4.find())
		{
			System.out.println(m4.start()+"-----"+m4.group());
		}
		System.out.println();
		
		Pattern p5=Pattern.compile("[a-zA-Z0-9]");
		Matcher m5=p5.matcher("a1b7@z#D");
		while(m5.find())
		{
			System.out.println(m5.start()+"-----"+m5.group());
		}
		System.out.println();
		
		Pattern p6=Pattern.compile("[^a-zA-Z0-9]");
		Matcher m6=p6.matcher("a1b7@z#D");
		while(m6.find())
		{
			System.out.println(m6.start()+"-----"+m6.group());
		}
		System.out.println();
	}

}

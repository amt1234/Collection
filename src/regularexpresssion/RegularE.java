package regularexpresssion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularE {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a");

		Matcher m = p.matcher("abaabbaaaba");
		while (m.find()) {
			System.out.println(m.start() + "----" + m.group());
		}
		System.out.println("-------------------------");
		Pattern p1 = Pattern.compile("a+");

		Matcher m1 = p1.matcher("abaabbaaaba");
		while (m1.find()) {
			System.out.println(m1.start() + "----" + m1.group());
		}
		System.out.println("-------------------------");
		Pattern p2 = Pattern.compile("a*");

		Matcher m2 = p2.matcher("abaabbaaaba");
		while (m2.find()) {
			System.out.println(m2.start() + "----" + m2.group());
		}
		System.out.println("-------------------------");

		Pattern p3 = Pattern.compile("a?");

		Matcher m3 = p3.matcher("abaabbaaaba");
		while (m3.find()) {
			System.out.println(m3.start() + "----" + m3.group());
		}
	}

}

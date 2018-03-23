package regularexpresssion;

import java.util.regex.Pattern;

public class RegularSplit {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\.");
		String[] string = pattern.split("www.abc.com");
		for (String s1 : string) {
			System.out.println(s1);
		}
		System.out.println();

		Pattern pattern2 = Pattern.compile("\\s");
		String[] strings = pattern2.split("abc pqr xyz");
		for (String s2 : strings) {
			System.out.println(s2);
		}

	}

}

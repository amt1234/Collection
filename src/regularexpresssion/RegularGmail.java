package regularexpresssion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularGmail {

	public static void main(String[] args) {
		m();

	}

	public static void m() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter email id : ");
		String email = scanner.next();
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m = p.matcher(email);
		if (m.find() && m.group().equals(email)) {
			System.out.println("valid :" + m.group());

		} else {
			System.out.println("invalid retry");
			m();

		}
		scanner.close();
	}

}

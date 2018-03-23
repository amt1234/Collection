package regularexpresssion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameR {

	public static void main(String[] args) {
		String string = "Hello <<name>>, We have your full name as <<full name>> "
				+ "in our system. your contact number is 91-xxxxxxxxxx. "
				+ "Please,let us know in case of any clarification Thank you " + "BridgeLabz 01/01/2016.";
		isName(string);
		isNumber(string);
		System.out.println(string);

	}

	public static void isName(String string) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter name: ");
		String name = scanner.nextLine();;
		String array[] = name.split("\\s+");
		
		Pattern p = Pattern.compile("[A-Za-z][a-zA-Z\\s]*[A-Za-z][a-zA-Z]*");
		Matcher m = p.matcher(name);
		if (m.find() && m.group().equals(name)) {
	
			string = string.replace("<<name>>", array[0]);
			string = string.replace("<<full name>>", name);

		} else {
			System.out.println("invalid retry");
			isName(string);

		}
	}
		
		public static void isNumber(String string)
		{
			Scanner scanner = new Scanner(System.in);
		System.out.println("enter mobile number: ");
		String mobile=scanner.nextLine();
			Pattern p1 = Pattern.compile("[7-9][0-9]{9}");
			Matcher m1 = p1.matcher(mobile);
			if (m1.find() && m1.group().equals(mobile)) {
				string = string.replace("xxxxxxxxxx", mobile);
			} else {
				System.out.println("invalid retry");
				isNumber(string);
			}

		
		//System.out.println(string);
		scanner.close();
	}
	
	

}

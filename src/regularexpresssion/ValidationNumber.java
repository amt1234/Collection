package regularexpresssion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the mobile number :");
		String number = scanner.nextLine();
		Pattern pattern = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher matcher = pattern.matcher(number);
	if(matcher.find()&&matcher.group().equals(number))
	{
		System.out.println("valid number :"+matcher.group());
	}
	else
	{
		System.out.println("Invalid number retry");
		
	}

	}

}

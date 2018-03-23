package regularexpresssion;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		StringTokenizer stringTokenizer=new StringTokenizer("sai software solution");
		while(stringTokenizer.hasMoreTokens())
		{
			System.out.println(stringTokenizer.nextToken());
		}
		System.out.println();
		
		StringTokenizer stringTokenizer2=new StringTokenizer("2-2-2018","-");
		while(stringTokenizer2.hasMoreTokens())
		{
			System.out.println(stringTokenizer2.nextToken());
		}

	}

}

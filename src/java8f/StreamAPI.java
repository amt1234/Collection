package java8f;

import java.util.*;

public class StreamAPI {

	public static void main(String[] args) {
		List<Integer> values=new ArrayList<>();

		for (int i = 0; i <=100; i++)
		{
			values.add(i);
			
		}
		//values.forEach(System.out::println);
		//values.stream().forEach(System.out::println);
		values.parallelStream().forEach(System.out::println);
	}

}

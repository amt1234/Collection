package java8f;

import java.util.*;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomDemo {

	public static void main(String[] args) {
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		squaresList.forEach(System.out::println);
		
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

		//get count of empty string
		int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Number of empty streams :"+count);
		
		System.out.println("\nsort method ");
		random.ints().limit(10).sorted().forEach(System.out::println);
		

		//get count of empty string
		count = (int) strings.parallelStream().filter(string -> string.isEmpty()).count();
	
		
		
	}

}

package java8f;

import java.util.*;
import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {
	List<Integer> values=Arrays.asList(4,5,6,8,9);
	
	values.forEach(i ->System.out.println(i));

	}

}

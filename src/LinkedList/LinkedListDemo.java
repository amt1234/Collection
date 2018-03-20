package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<Comparable> names = new LinkedList<Comparable>();
		names.add("Rams");
		names.add("Posa");
		names.add("Chinni");
		names.add(2011);

		System.out.println("LinkedList content: " + names);
		System.out.println("LinkedList size: " + names.size());
	}
}

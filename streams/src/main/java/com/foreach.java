package com;

import java.util.List;

public class foreach {
	public static void main(String[]args)
	{
		List<String> ls=List.of("a","b","c","d","e");
		ls.forEach(System.out::println);
	}
}

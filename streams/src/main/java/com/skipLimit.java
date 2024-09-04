package com;

import java.util.List;

public class skipLimit {
	public static void main(String[]args)
	{
		System.out.println("Skipped");
		List<Integer> ls=List.of(0,1,1,2,3,4,5,5);
		ls.stream().skip(3).toList().forEach(System.out::println);
		System.out.println("Limitted");
		ls.stream().limit(3).toList().forEach(System.out::println);
	}
}

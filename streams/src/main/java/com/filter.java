package com;

import java.util.List;
import java.util.Optional;

public class filter {
	public static void main(String[]args)
	{
		List<String> ls=List.of("a","b","c","d","e");
		ls.stream().filter(ls1 ->ls1=="c").forEach(System.out::println);
		Optional<String> s=ls.stream().findFirst();
		System.out.println(s);
	}
}

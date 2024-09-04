package com;

import java.util.List;

public class sorted {
	public static void main(String[]args)
	{
		List<Integer> ls=List.of(10,1,21,2,3,4,65,85);
		ls.stream().sorted().toList().forEach(System.out::println);;
	}
}

package com;

import java.util.List;

public class distinct {
	public static void main(String[]args)
	{
		List<Integer> ls=List.of(0,1,1,2,3,4,5,5);
		ls.stream().distinct().toList().forEach(System.out::println);;
	}
}

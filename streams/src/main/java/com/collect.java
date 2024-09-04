package com;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class collect {
	public static void main(String[]args)
	{
		List<Integer> ls=List.of(1,2,3,4,5,6);
		Set<Integer> s= ls.stream().collect(Collectors.toSet());
		System.out.println(s);
	}
}

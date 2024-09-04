package com;

import java.util.Arrays;
import java.util.List;

public class flatmap {
	public static void main(String[]args)
	{
		List<List<Integer>>ls=Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6,7),Arrays.asList(8,9,10));
		List<Integer> res=ls.stream().flatMap(list->list.stream()).toList();
		System.out.println(res);
	}
}

package com;

import java.util.List;

public class match {
	public static void main(String[]args)
	{
		System.out.println("Skipped");
		List<Integer> ls=List.of(0,1,2,3,4,5,6,7);
		boolean res1 = ls.stream().anyMatch(n->n==1);
		System.out.println(res1);
		boolean res2 = ls.stream().allMatch(n->n>-1);
		System.out.println(res2);
		boolean res3 = ls.stream().noneMatch(n->n==2);
		System.out.println(res3);
	}
}

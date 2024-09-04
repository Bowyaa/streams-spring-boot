package com;

import java.util.List;

public class map {
public static void main(String[]args)
{
	List<Integer>ls=List.of(1,2,3,4,5);
	ls.stream().map(res->res*5).forEach(System.out::println);;
}
}

package com;

import java.util.List;
import java.util.Optional;

public class reduce {
public static void main(String[]args)
{
	List<String> ls=List.of("a","b","c","d","e");
	String s=ls.stream().reduce("",(ps,str) ->ps+" "+str);
	System.out.println(s);
}
}

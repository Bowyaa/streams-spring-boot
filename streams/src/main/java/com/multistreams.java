package com;

import java.util.stream.Stream;

public class multistreams {
	record userclass( int age,String name, int salary) {
    }
public static void main(String[]args)
{
	        userclass[] ls = {
		    new userclass(25, "a", 100000), 
		    new userclass(35, "b", 200000), 
		    new userclass(44, "c", 200000)
		};

		  double res=Stream.of(ls).filter(user->user.age>25).mapToDouble(userclass::salary).sum();
		  System.out.println(res);
		  
		  Stream.of(ls).map(userclass::salary).distinct().sorted().limit(3).toList().forEach(System.out::println);
}
}

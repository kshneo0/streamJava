package com.fp.ch04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ch04Sec04 {

	public static void main(String[] args) {
		Predicate<Integer> isPositive = x -> x > 0;
//		System.out.println(isPositive.test(-10));
		
		List<Integer> inputs = Arrays.asList(10,-5,4,-2,0,3);
		System.out.println("Positive number: " + filter(inputs, isPositive ));
		System.out.println("Non-Positive number: " + filter(inputs, isPositive.negate() ));
		System.out.println("Non-Negative number: " + filter(inputs, isPositive.or( x -> x == 0 )));
		System.out.println("Positive Even number: " + filter(inputs, isPositive.and( x -> x % 2 == 0 )));

	}
	
	public static <T> List<T> filter(List<T> inputs, Predicate<T> condition){
		List<T> output = new ArrayList<>();
		for (T input : inputs) {
			if(condition.test(input)) {
				output.add(input);
			}
		}
		return output;
	}

}

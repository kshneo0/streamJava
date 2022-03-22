package com.fp.ch03;

import com.fp.ch03.util.TriFunction;
public class Ch03Sec04 {

	public static void main(String[] args) {
		TriFunction<Integer,Integer,Integer,Integer> addThreeNumbers = (x,y,u) -> x + y + u;
		int result = addThreeNumbers.apply(3, 2, 5);
		System.out.println(result);
	}

}

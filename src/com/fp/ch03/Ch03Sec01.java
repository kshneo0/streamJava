package com.fp.ch03;

import java.util.function.Function;

import com.fp.ch03.util.Adder;

public class Ch03Sec01 {
	public static void main(String[] args) {
		Function<Integer, Integer> myAdder = new Adder();
		int result = myAdder.apply(5);
		System.out.println(result);
	}
}

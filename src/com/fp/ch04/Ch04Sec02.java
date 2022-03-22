package com.fp.ch04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ch04Sec02 {

	public static void main(String[] args) {
		Consumer<String> myStringCinsumer = (str) -> System.out.println(str);
//		myStringCinsumer.accept("hello");
//		myStringCinsumer.accept("world");
		
		List<Integer> integerInputs = Arrays.asList(4,2,3);
		Consumer<Integer> myIntegerProcessor = (x) -> System.out.println("Processing integer " + x);
		process(integerInputs, myIntegerProcessor);
		
		Consumer<Integer> myDifferentProcessor = x -> System.out.println("Processing integer in different way " + x);
		process(integerInputs, myDifferentProcessor);
		
		Consumer<Double> myDoubleProcessor = x -> System.out.println("Processing double " + x);
		List<Double> doubleInputs = Arrays.asList(1.1,2.2,3.3);
		process(doubleInputs, myDoubleProcessor);

	}
	
//	public static void process(List<Integer> inputs, Consumer<Integer> processor) {
//		for (Integer input : inputs) {
//			processor.accept(input);
//		}
//	}

	public static <T> void process(List<T> inputs, Consumer<T> processor) {
		for (T input : inputs) {
			processor.accept(input);
		}
	}
}

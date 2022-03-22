package com.fp.ch04;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Ch04Sec03 {

	public static void main(String[] args) {
		BiConsumer<Integer, Double> myDoubleProcessor = 
				(index, input) -> System.out.println("Processing "+ input + " at index "+index);
		
		List<Double> doubleInputs = Arrays.asList(1.1,2.2,3.3);
		process(doubleInputs, myDoubleProcessor);
		

	}
	
	public static <T> void process(List<T> inputs, BiConsumer<Integer, T> processor) {
		for (int i = 0; i< inputs.size(); i++) {
			processor.accept(i, inputs.get(i));
		}
	}

}

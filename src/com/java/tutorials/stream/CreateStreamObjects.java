package com.java.tutorials.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreateStreamObjects {

	public static void main(String[] args) {

		// create a stream
		Stream<String> stream1 = Stream.of("Amlan", "Tapa", "Khushi", "Arpita");
		stream1.forEach(System.out::println);

		System.out.println("--------------------------------------------------");
		
		// create a stream from sources
		Collection<String> collection = Arrays.asList("xy", "ab", "mk", "kl");
		Stream<String> stream2 = collection.stream();
		stream2.forEach(System.out::println);
		
		System.out.println("--------------------------------------------------");
		
		
		
	}

}

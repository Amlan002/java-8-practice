package com.java.tutorials.stream;

import java.util.Optional;

public class OptionalStream {

	public static void main(String[] args) throws Exception {
		String book="Java";
		if(book!=null) {
			System.out.println("Using old method "+book.toUpperCase());
		}
		Optional<String> optional=Optional.ofNullable(book);
		if(optional.isPresent()) {
			System.out.println("Using optional "+optional.get().toUpperCase());
		}
		
		System.out.println(optional.orElse("Java 9").toUpperCase());
		
	}
}
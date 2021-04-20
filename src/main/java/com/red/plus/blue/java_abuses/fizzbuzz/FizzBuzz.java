package com.red.plus.blue.java_abuses.fizzbuzz; 

/** FizzBuzz.java
 * 
 * An implementation of the FizzBuzz program in Java that does not use any:
 * - Semicolons
 * - If-statements 
 * - Mathematical operations
 * - Mutation
 * 
 * The no semicolons rule excludes the package declaration (because you can create java files in the default package) and the import statements because the code *could* be written without them but would be far less readable.  
 * @author Kyle Adams
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		for(List<String> fizzes : List.of(List.of("", "", "Fizz"))) {
		for(List<String> buzzes : List.of(List.of("", "", "", "", "Buzz"))) {
		for(List<String> keys : List.of(List.of("", "Buzz", "Fizz", "FizzBuzz"))) {
		for(List<BiFunction<String, Integer, String>> functions : List.of(Arrays.<BiFunction<String, Integer, String>>asList(
			(key, number) -> System.out.append(number.toString().concat(" \n")).toString(),
			(key, number) -> System.out.append(key.concat(" \n")).toString(),
			(key, number) -> System.out.append(key.concat(" \n")).toString(),
			(key, number) -> System.out.append(key.concat(" \n")).toString()
		))) {
		for(Map<String, BiFunction<String, Integer, String>> nameToFunction : List.of(Stream.of(0, 1, 2, 3).collect(Collectors.toMap(index -> keys.get(index), index -> functions.get(index))))) {
			
			for(int number : IntStream.range(1, 101).toArray()) {
				while(null == nameToFunction.get(fizzes.get(0).concat(buzzes.get(0))).apply(fizzes.get(0).concat(buzzes.get(0)), number)) {}
				while(null == (fizzes = List.of(fizzes.get(1), fizzes.get(2), fizzes.get(0)))) { }
				while(null == (buzzes = List.of(buzzes.get(1), buzzes.get(2), buzzes.get(3), buzzes.get(4), buzzes.get(0)))) {}
			}
				
		}}}}}
	}
	
}

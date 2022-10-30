package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java8Cgi {

	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(6, 2, 2, 3, 3, 8, 9, 6);
//		int datain = data.stream().mapToInt(i -> i).max().orElseThrow(NoSuchElementException::new);
//		System.out.println(datain);
		
	Optional<Integer> sumtata= 	data.stream().reduce((a,b)-> a+b);
//		System.out.println(sumtata);
//		data.stream().sorted().collect(Collectors.toList()).forEach(System.out::print);
//		System.out.println(data);

		int maxNumber3 = data.stream().max(Comparator.comparing(Integer::valueOf)).get();
//		System.out.println(maxNumber3);
		
	int res =	data.stream().max(Comparator.comparing(Integer::valueOf)).get();
	
	
//			data.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		
//
//		System.out.println("Maximum Value Element in the List: " + maxNumber3);
//
//		int maxNumber4 = data.stream().min(Comparator.comparing(Integer::valueOf)).get();
//		System.out.println("Min Value Element in the List: " + maxNumber4);

		Set<Integer> items = new HashSet<>();
//		Set<Integer> result = data.stream().filter(n -> !items.add(n)) // Set.add() returns false if the element was
//																		// already in the set.
//				.collect(Collectors.toSet());

//		duplicate//
		Set<Integer> result = data.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // create
//		 7=1,
																														// 9=2}
				.entrySet().stream() // Map -> Stream
				.filter(m -> m.getValue() > 1) // if map value > 1, duplicate element
				.map(Map.Entry::getKey).collect(Collectors.toSet());
		System.out.print(result);

//		data.stream().filter(i -> Collections.frequency(data, i) > 1).collect(Collectors.toSet())
//				.forEach(System.out::println);

//	Map<Integer, Long> map = 
			data.stream().collect(Collectors.groupingBy
					(Function.identity(), Collectors.counting())).entrySet().forEach(System.out::println);

//	System.out.println(map);
		// reverse

		List<Integer> data2 = data.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		System.out.println("reverse");
//		data2.forEach(System.out::print);

	}

}
